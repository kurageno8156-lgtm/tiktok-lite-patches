package app.yourname.patches.tiktoklite

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.yourname.patches.shared.TikTokLiteCompatibility.COMPATIBILITY_TIKTOK_LITE

/**
 * TikTok Lite 逕ｨ繝代ャ繝・寔縲・ *
 * 笆 繝薙Ν繝画婿豕・
 *   繝・Φ繝励Ξ繝ｼ繝医Μ繝昴ず繝医Μ (MorpheApp/morphe-patches-template) 繧剃ｽｿ縺・・ *   縺薙・ patches/ 繝・ぅ繝ｬ繧ｯ繝医Μ縺ｮ蜀・ｮｹ繧堤ｽｮ縺肴鋤縺医※
 *     ./gradlew buildAndroid
 *   竊・patches/build/libs/patches-*.mpp 縺後〒縺阪ｋ縲・ *
 * 笆 蜈ｬ髢九＠縺ｦ繝ｪ繝｢繝ｼ繝・RL蛹悶☆繧区婿豕・
 *   GitHub 縺ｫ push 縺吶ｋ縺ｨ release.yml 縺・.mpp 繧偵Μ繝ｪ繝ｼ繧ｹ縺励・ *   patches-bundle.json 繧定・蜍墓峩譁ｰ縺吶ｋ縲・ *   繝ｪ繝｢繝ｼ繝・RL = https://github.com/縺ゅ↑縺溘・繝ｦ繝ｼ繧ｶ繝ｼ蜷・繝ｪ繝昴ず繝医Μ蜷・ */

// ---------------------------------------------------------
// 繝代ャ繝・: 蠎・相陦ｨ遉ｺ繝｡繧ｽ繝・ラ繧貞ｸｸ縺ｫ false 繧定ｿ斐☆繧医≧縺ｫ譖ｸ縺肴鋤縺医ｋ
// (繝輔ぅ繝ｳ繧ｬ繝ｼ繝励Μ繝ｳ繝医・荳ｭ霄ｫ繧貞ｮ滓ｩ溘↓蜷医ｏ縺帙※縺九ｉ菴ｿ縺・％縺ｨ)
// ---------------------------------------------------------
@Suppress("unused")
val disableAdsPatch = bytecodePatch(
    name = "Disable ads",
    description = "蠎・相陦ｨ遉ｺ繝｡繧ｽ繝・ラ繧堤┌蜉ｹ蛹悶＠縺ｾ縺吶・,
    default = true
) {
    compatibleWith(COMPATIBILITY_TIKTOK_LITE)

    execute {
        AdShowFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )
    }
}

// ---------------------------------------------------------
// 繝代ャ繝・: 隗｣譫舌Ο繧ｰ騾∽ｿ｡繝｡繧ｽ繝・ラ繧堤ｩｺ縺ｫ縺吶ｋ
// ---------------------------------------------------------
@Suppress("unused")
val disableAnalyticsPatch = bytecodePatch(
    name = "Disable analytics",
    description = "繧｢繧ｯ繧ｻ繧ｹ隗｣譫舌・騾∽ｿ｡蜃ｦ逅・ｒ辟｡蜉ｹ蛹悶＠縺ｾ縺吶・,
    default = true
) {
    compatibleWith(COMPATIBILITY_TIKTOK_LITE)

    execute {
        AnalyticsFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )
    }
}
