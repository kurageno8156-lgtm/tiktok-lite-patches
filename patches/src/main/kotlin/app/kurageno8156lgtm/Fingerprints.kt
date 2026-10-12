package app.yourname.patches.tiktoklite

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.opcode
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

/**
 * 繝輔ぅ繝ｳ繧ｬ繝ｼ繝励Μ繝ｳ繝・= 縲後←縺ｮ繝｡繧ｽ繝・ラ縺ｫ繝代ャ繝√ｒ蠖薙※繧九°縲阪・謖・ｮ壹・ *
 * 菴懊ｊ譁ｹ:
 * 1. TikTok Lite 縺ｮ APK 繧・jadx (https://github.com/skylot/jadx) 縺ｧ髢九￥
 * 2. 蠎・相繝ｻ隗｣譫仙・逅・ｒ諡・≧繧ｯ繝ｩ繧ｹ繧呈爾縺・ *    (萓・ com/ss/android/downloadad, com/bytedance/embedapplog,
 *     google/android/gms/ads 縺ｪ縺ｩ縺ｮ蜻ｼ縺ｳ蜃ｺ縺礼ｮ・園)
 * 3. 蟇ｾ雎｡繝｡繧ｽ繝・ラ縺ｮ迚ｹ蠕ｴ(繧ｯ繝ｩ繧ｹ蜷・謌ｻ繧雁､/蜷ｫ縺ｾ繧後ｋ譁・ｭ怜・/opcode蛻・繧偵％縺薙↓譖ｸ縺・ *
 * 蜈ｬ蠑上ラ繧ｭ繝･繝｡繝ｳ繝・
 * https://github.com/MorpheApp/morphe-patcher/blob/main/docs/2_2_1_fingerprinting.md
 *
 * 豕ｨ諢・ TikTok Lite 縺ｯ髮｣隱ｭ蛹悶′蠑ｷ縺上√ヰ繝ｼ繧ｸ繝ｧ繝ｳ繧｢繝・・縺ｧ繧ｯ繝ｩ繧ｹ蜷阪・繝｡繧ｽ繝・ラ蜷阪′
 * 螟峨ｏ繧九◆繧√∵枚蟄怜・繝ｪ繝・Λ繝ｫ繧・opcode 蛻励↑縺ｩ縲悟､峨ｏ繧翫↓縺上＞迚ｹ蠕ｴ縲阪〒謖・ｮ壹☆繧九・縺碁延蜑・・ */

// 萓・ 蠎・相陦ｨ遉ｺ繧貞宛蠕｡縺吶ｋ繝｡繧ｽ繝・ラ繧呈爾縺吶ヵ繧｣繝ｳ繧ｬ繝ｼ繝励Μ繝ｳ繝・髮帛ｽ｢)
// string() 縺ｮ荳ｭ霄ｫ縺ｯ jadx 縺ｧ螳滄圀縺ｫ遒ｺ隱阪＠縺滓枚蟄怜・縺ｫ鄂ｮ縺肴鋤縺医ｋ縺薙→
object AdShowFingerprint : Fingerprint(
    definingClass = ":com/ss/",               // 繝代ャ繧ｱ繝ｼ繧ｸ縺ｮ荳驛ｨ蛻・〒驛ｨ蛻・ｸ閾ｴ
    returnType = "Z",                          // boolean 繧定ｿ斐☆繝｡繧ｽ繝・ラ
    accessFlags = listOf(AccessFlags.PUBLIC),
    filters = listOf(
        // 螳滄圀縺ｮAPK蜀・〒遒ｺ隱阪＠縺溷ｺ・相髢｢騾｣縺ｮ譁・ｭ怜・繝ｪ繝・Λ繝ｫ縺ｫ鄂ｮ縺肴鋤縺医ｋ
        string("show_ads"),
        opcode(Opcode.RETURN)
    )
)

// 萓・ 繧､繝吶Φ繝医Ο繧ｰ騾∽ｿ｡繝｡繧ｽ繝・ラ繧呈爾縺吶ヵ繧｣繝ｳ繧ｬ繝ｼ繝励Μ繝ｳ繝・髮帛ｽ｢)
object AnalyticsFingerprint : Fingerprint(
    definingClass = ":com/bytedance/",
    returnType = "V",                          // void 繝｡繧ｽ繝・ラ
    filters = listOf(
        string("event"),
        opcode(Opcode.RETURN_VOID)
    )
)
