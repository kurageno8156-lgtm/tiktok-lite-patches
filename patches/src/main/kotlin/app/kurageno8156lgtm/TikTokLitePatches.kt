package app.kurageno8156lgtm

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

@Suppress("unused")
val removeSplashAdsPatch = bytecodePatch(
    name = "Remove Splash Ads",
    description = "TikTok Liteのスプラッシュ広告を削除します",
    default = true
) {
    compatibleWith("com.ss.android.ugc.tiktok.lite"("43.5.3"))

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
