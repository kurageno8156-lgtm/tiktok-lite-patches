package app.kurageno8156lgtm

import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.patch.compatibleWith

@Suppress("unused")
val removeSplashAdsPatch = bytecodePatch(
    name = "Remove Splash Ads",
    description = "TikTok Liteのスプラッシュ広告を削除します",
) {
    compatibleWith("com.zhiliaoapp.musically.go"("43.5.3"))

    execute {
        ShouldShowSplashAdFingerprint.method.addInstruction(
            0,
            "const/4 v0, 0x0",
            "return v0"
        )
    }
}
