package online.dgbcraft.carpet.mixin.sleepIgnoreFaker;

import carpet.patches.EntityPlayerMPFake;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.SleepManager;
import online.dgbcraft.carpet.CarpetDGBCraftSetting;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SleepManager.class)
public class SleepManagerMixin {

    @Dynamic
    @Redirect(
            method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/server/network/ServerPlayerEntity;isSpectator()Z"
            ),
            allow = 1
    )
    private static boolean isSpectatorOrFakeOnTickCheck(ServerPlayerEntity player) {
        if (CarpetDGBCraftSetting.sleepIgnoreFaker) {
            return player instanceof EntityPlayerMPFake || player.isSpectator();
        } else {
            return player.isSpectator();
        }
    }
}
