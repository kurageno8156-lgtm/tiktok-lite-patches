package app.kurageno8156lgtm

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.methodFingerprint

object ShouldShowSplashAdFingerprint : Fingerprint(
    returnType = "Z",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.FINAL,
    parameters = listOf(),
    customFingerprint = { method, _ ->
        method.definingClass == "Lcom/bytedance/ies/ugc/aweme/commercialize/splash/core/SplashAdServiceImpl;" &&
        method.name == "LJIILL"
    }
)
