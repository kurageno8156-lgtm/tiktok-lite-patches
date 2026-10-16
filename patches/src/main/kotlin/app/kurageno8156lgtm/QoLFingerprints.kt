package app.kurageno8156lgtm

import app.morphe.patcher.Fingerprint

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
    strings = listOf("playback_speed")
)

object SpeedControlParentAltFingerprint : Fingerprint(
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

object SpeedLimitFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("max_speed", "speed_limit", "playback_speed_max")
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

object DownloadEnableFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("enable_download", "download_enable")
)

object AclNoWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("AclCommonShare")
)

object NeedWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("need_watermark")
)

object AddWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("add_watermark")
)

object ShouldAddWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("should_add_watermark")
)

object WithWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("with_watermark")
)

object WaterMarkFlagFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("water_mark", "watermark_flag")
)

object DownloadWithoutWatermarkFingerprint : Fingerprint(
    returnType = "Z",
    strings = listOf("download_without_watermark", "no_watermark")
)

object DownloadUrlSelectFingerprint : Fingerprint(
    strings = listOf("download_addr", "play_addr")
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
