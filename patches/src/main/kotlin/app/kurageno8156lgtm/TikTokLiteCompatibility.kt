package app.yourname.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object TikTokLiteCompatibility {
    // TikTok Lite 縺ｮ繝代ャ繧ｱ繝ｼ繧ｸ蜷阪・ com.zhiliaoapp.musically.go
    val COMPATIBILITY_TIKTOK_LITE = Compatibility(
        name = "TikTok Lite",
        packageName = "com.zhiliaoapp.musically.go",
        apkFileType = ApkFileType.APK,   // APKM/XAPK繧剃ｽｿ縺・↑繧・ApkFileType.APKM
        appIconColor = 0x010101,          // 繧｢繧､繧ｳ繝ｳ縺ｮ閭梧勹濶ｲ
        targets = listOf(
            // 螳滄圀縺ｫ髢狗匱繝ｻ讀懆ｨｼ縺励◆繝舌・繧ｸ繝ｧ繝ｳ繧貞ｿ・★謖・ｮ壹☆繧九・            // 萓・ AppTarget(version = "37.3.2")
            // 讀懆ｨｼ蜑阪・ null (experimental) 縺ｮ縺ｾ縺ｾ縺ｫ縺吶ｋ縺ｨ莉ｻ諢上ヰ繝ｼ繧ｸ繝ｧ繝ｳ縺ｫ驕ｩ逕ｨ縺輔ｌ繧九・            AppTarget(
                version = null,
                isExperimental = true
            )
        )
    )
}
