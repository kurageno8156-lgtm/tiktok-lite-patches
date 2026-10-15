package app.kurageno8156lgtm

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.getInstruction
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.util.indexOfFirstInstructionOrThrow
import app.morphe.util.indexOfFirstStringInstructionOrThrow
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction

@Suppress("unused")
val forceShowAutoScrollPatch = bytecodePatch(
    name = "Force show Auto scroll",
    description = "TikTok Lite 43.5.3の自動スクロール機能ゲートと表示ゲートを強制的に有効化します",
    default = true
) {
    compatibleWith("com.ss.android.ugc.tiktok.lite"("43.5.3"))

    execute {
        // Bypass the fyp_auto_scroll rollout gate.
        AutoScrollFeatureGateFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )

        // Override the boolean result of the panel_auto_scroll gate while
        // preserving TikTok Lite's original action factory and action object.
        AutoScrollActionFactoryFingerprint.method.apply {
            val panelGateStringIndex =
                indexOfFirstStringInstructionOrThrow("panel_auto_scroll")
            val panelGateResultIndex = indexOfFirstInstructionOrThrow(
                panelGateStringIndex + 1,
                Opcode.MOVE_RESULT
            )
            val panelGateResultRegister =
                getInstruction<OneRegisterInstruction>(panelGateResultIndex).registerA

            addInstructions(
                panelGateResultIndex + 1,
                """
                    const/4 v$panelGateResultRegister, 0x1
                """
            )
        }
    }
}
