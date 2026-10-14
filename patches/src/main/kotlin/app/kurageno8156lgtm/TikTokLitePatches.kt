package app.kurageno8156lgtm

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.bytecodePatch

private val tikTokLiteCompatibility = Compatibility(
    name = "TikTok Lite",
    packageName = "com.ss.android.ugc.tiktok.lite",
    description = "TikTok Lite の元 APK。バージョン 43.5.3 を使用してください。",
    apkFileType = ApkFileType.APK,
    targets = listOf(
        AppTarget(version = "43.5.3")
    )
)

@Suppress("unused")
val removeSplashAdsPatch = bytecodePatch(
    name = "Remove Splash Ads",
    description = "TikTok Liteのスプラッシュ広告を削除します",
    default = true
) {
    compatibleWith(tikTokLiteCompatibility)

    execute {
        SplashAdFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )
    }
}

@Suppress("unused")
val enableAutoScrollPatch = bytecodePatch(
    name = "Enable Auto Scroll",
    description = "TikTok Liteの自動スクロール機能を有効化します",
    default = true
) {
    compatibleWith(tikTokLiteCompatibility)

    execute {
        AutoScrollFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )
    }
}
