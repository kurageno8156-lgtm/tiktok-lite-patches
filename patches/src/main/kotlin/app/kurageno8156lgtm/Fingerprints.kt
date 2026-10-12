package app.kurageno8156lgtm

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object AutoScrollFingerprint : Fingerprint(
    definingClass = "Lcom/ss/android/ugc/feed/platform/panel/autoscroll/FypAutoScrollServiceImpl;",
    name = "LIZ",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf()
)
