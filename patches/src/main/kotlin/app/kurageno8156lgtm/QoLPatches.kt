package app.kurageno8156lgtm

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

private const val PKG = "com.ss.android.ugc.tiktok.lite"
private const val VER = "43.5.3"

private fun forceTrue() = """
    const/4 v0, 0x1
    return v0
""".trimIndent()

private fun forceFalse() = """
    const/4 v0, 0x0
    return v0
""".trimIndent()

@Suppress("unused")
val showSeekbarPatch = bytecodePatch(
    name = "Show Seekbar",
    description = "動画のシークバーを常時表示し、巻き戻し・早送りしやすくします",
    default = true
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { ShouldShowSeekBarFingerprint.method.addInstructions(0, forceTrue()) }
        runCatching { ShouldShowSeekBarAltFingerprint.method.addInstructions(0, forceTrue()) }
    }
}

@Suppress("unused")
val playbackSpeedPatch = bytecodePatch(
    name = "Playback Speed",
    description = "再生速度メニューを解放し、上限ゲートを緩和します（UIに8倍が出るかは端末・版次第）",
    default = true
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { PlaybackSpeedEnabledFingerprint.method.addInstructions(0, forceTrue()) }
        runCatching { SpeedPanelGateFingerprint.method.addInstructions(0, forceTrue()) }
        runCatching {
            val m = SpeedControlParentFingerprint.method
            if (m.returnType == "Z") m.addInstructions(0, forceTrue())
        }
        runCatching {
            val m = SpeedControlParentAltFingerprint.method
            if (m.returnType == "Z") m.addInstructions(0, forceTrue())
        }
        runCatching { SpeedLimitFingerprint.method.addInstructions(0, forceTrue()) }
    }
}

@Suppress("unused")
val rememberClearDisplayPatch = bytecodePatch(
    name = "Remember Clear Display",
    description = "クリア表示状態を次の動画でも維持しやすくします",
    default = true
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { ClearModeRememberFingerprint.method.addInstructions(0, forceTrue()) }
    }
}

@Suppress("unused")
val simSpoofRegionPatch = bytecodePatch(
    name = "SIM Spoof / Region Unlock",
    description = "リージョン制限系のクライアントゲートを緩和します",
    default = false
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { RegionLockGateFingerprint.method.addInstructions(0, forceTrue()) }
    }
}

@Suppress("unused")
val hideFeedAdsAndLivePatch = bytecodePatch(
    name = "Feed Filter & Hide Ads",
    description = "フィード広告・LIVEカード等の判定ゲートを抑制します",
    default = true
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { FeedAdGateFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { SplashOrFeedAdFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { FeedLiveCardFingerprint.method.addInstructions(0, forceFalse()) }
    }
}

@Suppress("unused")
val hideShopAndPromoUiPatch = bytecodePatch(
    name = "Hide Shop / Promo UI",
    description = "ショップ入口などプロモ系UIゲートを無効化します",
    default = false
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { ShopEntryGateFingerprint.method.addInstructions(0, forceFalse()) }
    }
}

@Suppress("unused")
val unlimitedDownloadPatch = bytecodePatch(
    name = "Unlimited Downloads",
    description = "ダウンロード制限フラグを緩和し保存可能にします",
    default = true
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { DownloadAllowFingerprint.method.addInstructions(0, forceTrue()) }
        runCatching { DownloadEnableFingerprint.method.addInstructions(0, forceTrue()) }
        runCatching { DownloadRestrictFingerprint.method.addInstructions(0, forceFalse()) }
    }
}

@Suppress("unused")
val removeWatermarkPatch = bytecodePatch(
    name = "Remove Watermark",
    description = "透かし付与フラグを無効化し、透かし無しダウンロード判定を強制します",
    default = true
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { NeedWatermarkFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { AddWatermarkFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { ShouldAddWatermarkFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { WithWatermarkFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { WaterMarkFlagFingerprint.method.addInstructions(0, forceFalse()) }
        runCatching { DownloadWithoutWatermarkFingerprint.method.addInstructions(0, forceTrue()) }
        runCatching { AclNoWatermarkFingerprint.method.addInstructions(0, forceTrue()) }
    }
}

@Suppress("unused")
val settingsHookStubPatch = bytecodePatch(
    name = "Settings Hook Stub",
    description = "設定画面のフック位置を検出するスタブ",
    default = false
) {
    compatibleWith(PKG(VER))
    execute {
        runCatching { SettingsFragmentFingerprint.method }
    }
}
