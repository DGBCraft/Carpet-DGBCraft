package online.dgbcraft.carpet.mixin.fakePlayerNameLimit;

import carpet.commands.PlayerCommand;
import carpet.utils.Messenger;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;
import online.dgbcraft.carpet.CarpetDGBCraftSetting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerCommand.class)
public class PlayerCommandMixin {
    
    @Inject(
        method = "cantSpawn",
        at = @At("HEAD"),
        cancellable = true,
        remap = false
    )
    private static void cantSpawn(CommandContext<ServerCommandSource> context, CallbackInfoReturnable<Boolean> cir) {
        String playerName = StringArgumentType.getString(context, "player");
        if (!CarpetDGBCraftSetting.FAKE_PLAYER_NAME_NO_PREFIX.equals(CarpetDGBCraftSetting.fakePlayerNamePrefixLimit)) {
            if (!playerName.startsWith(CarpetDGBCraftSetting.fakePlayerNamePrefixLimit)) {
                Messenger.m(context.getSource(), "r Player ", "rb " + playerName,
                    "r  has no \"" + CarpetDGBCraftSetting.fakePlayerNamePrefixLimit + "\" prefix");
                cir.setReturnValue(true);
            }
        }
    }

    @ModifyConstant(
        method = "spawn",
        constant = @Constant(intValue = 40),
        require = 1,
        remap = false
    )
    private static int nameLengthLimit(int value)
    {
        return CarpetDGBCraftSetting.fakePlayerNameLengthLimit;
    }
}
