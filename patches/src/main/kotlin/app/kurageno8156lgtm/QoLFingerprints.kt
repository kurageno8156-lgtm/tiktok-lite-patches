package app.kurageno8156lgtm

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object ShouldShowSeekBarFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("can not show seekbar, state: 1, not in resume")
)

object ShouldShowSeekBarAltFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("can not show seekbar")
)

object SetSeekBarShowTypeFingerprint : Fingerprint(
    strings = listOf("setSeekBarShowType")
)

object SpeedControlParentFingerprint : Fingerprint(
    strings = listOf(
        "onStopTrackingTouch, hasTouchMove=",
        "already_shown_edge_speed_guide"
    )
)

object PlaybackSpeedEnabledFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("playback_speed")
)

object SpeedPanelGateFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("speed_panel", "video_speed")
)

object ClearDisplayStateFingerprint : Fingerprint(
    strings = listOf("clear_display", "clearDisplay")
)

object ClearModeRememberFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("is_clear_mode", "clear_mode")
)

object FeedAdGateFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("is_ad", "isAd")
)

object FeedLiveCardFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("is_live", "live_type")
)

object SplashOrFeedAdFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("commercialize", "is_commerce_ad")
)

object ShopEntryGateFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("tiktok_shop", "shop_entry")
)

object DownloadAllowFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("allow_download", "can_download")
)

object DownloadRestrictFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("download_restrict", "forbid_download")
)

object WatermarkEnableFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("need_watermark", "add_watermark")
)

object AclShareWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("should_add_watermark", "watermark")
)

object RegionLockGateFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("region_lock", "is_region_available")
)

object CountryIsoGateFingerprint : Fingerprint(
    strings = listOf("getSimCountryIso", "getNetworkCountryIso")
)

object SettingsFragmentFingerprint : Fingerprint(
    strings = listOf("settings_fragment", "SettingFragment")
)
