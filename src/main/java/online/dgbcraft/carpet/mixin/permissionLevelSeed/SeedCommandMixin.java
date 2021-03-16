package online.dgbcraft.carpet.mixin.permissionLevelSeed;

import net.minecraft.server.command.SeedCommand;
import net.minecraft.server.command.ServerCommandSource;
import online.dgbcraft.carpet.CarpetDGBCraftSetting;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SeedCommand.class)
public abstract class SeedCommandMixin {

    @Dynamic
    @SuppressWarnings("DefaultAnnotationParam")
    @Redirect(
        method = "method_13618",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/server/command/ServerCommandSource;hasPermissionLevel(I)Z",
            remap = true
        ),
        allow = 1,
        remap = false
    )
    private static boolean hasPermissionLevel(ServerCommandSource source, int level) {
        return source.hasPermissionLevel(Integer.parseInt(CarpetDGBCraftSetting.permissionLevelSeed));
    }
}
