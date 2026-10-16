# TikTok Lite Patches

<img src="assets/tiktok-lite-neon-icon.svg" width="180" alt="TikTok Lite neon icon" />

Morphe patches for TikTok Lite.

## How to use

Add this source to Morphe: https://morphe.software/add-source?github=kurageno8156-lgtm/tiktok-lite-patches

## Supported app

- Package: `com.ss.android.ugc.tiktok.lite`
- Version: `43.5.3`

## Patches

<!-- PATCHES_START EXPANDED -->
> **[v1.4.0](https://github.com/kurageno8156-lgtm/tiktok-lite-patches/releases/tag/v1.4.0)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;13 patches total
<details open>
<summary>📦 com.ss.android.ugc.tiktok.lite&nbsp;&nbsp;•&nbsp;&nbsp;12 patches</summary>
<br>

**🎯 Supported versions:**

| 43.5.3 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Enable Auto Scroll](#enable-auto-scroll) | TikTok Liteの自動スクロール機能を有効化します |  |
| [Feed Filter & Hide Ads](#feed-filter-hide-ads) | フィード広告・LIVEカード等の判定ゲートを抑制します |  |
| [Force show Auto scroll](#force-show-auto-scroll) | TikTok Lite 43.5.3の自動スクロール機能ゲートと表示ゲートを強制的に有効化します |  |
| [Hide Shop / Promo UI](#hide-shop-promo-ui) | ショップ入口などプロモ系UIゲートを無効化します |  |
| [Playback Speed](#playback-speed) | 再生速度変更を解放し、速度パネル関連ゲートを有効化します |  |
| [Remember Clear Display](#remember-clear-display) | クリア表示状態を次の動画でも維持しやすくします |  |
| [Remove Splash Ads](#remove-splash-ads) | TikTok Liteのスプラッシュ広告を削除します |  |
| [Remove Watermark](#remove-watermark) | 保存時のウォーターマーク付与フラグを無効化します |  |
| [SIM Spoof / Region Unlock](#sim-spoof-region-unlock) | リージョン制限系のクライアントゲートを緩和します |  |
| [Settings Hook Stub](#settings-hook-stub) | 設定画面のフック位置を検出するスタブ |  |
| [Show Seekbar](#show-seekbar) | 動画のシークバーを常時表示し、巻き戻し・早送りしやすくします |  |
| [Unlimited Downloads](#unlimited-downloads) | ダウンロード制限フラグを緩和し保存可能にします |  |

</details>

<details open>
<summary>📦 XYZ app&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 2.0.0 | 1.0.2 |
| :---: | :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Example Patch](#example-patch) | Example patch to start with. |  |

</details>

<!-- PATCHES_END -->

## Build

```bash
./gradlew buildAndroid
```

The built patch bundle is generated under `patches/build/libs/`.

## Icon artwork

The repository icon artwork is at [assets/tiktok-lite-neon-icon.svg](assets/tiktok-lite-neon-icon.svg).