package online.dgbcraft.carpet;

import carpet.settings.Rule;

import static carpet.settings.RuleCategory.COMMAND;
import static carpet.settings.RuleCategory.SURVIVAL;

public class CarpetDGBCraftSetting {

    @Rule(
        desc = "Modify permission level of /seed command",
        extra = "This rule does not affect the single player world ",
        options = {"0", "1", "2", "3", "4"},
        category = COMMAND
    )
    public static String permissionLevelSeed = "2";

    @Rule(
        desc = "Ignore fake players when skipping the night by sleeping",
        category = SURVIVAL
    )
    public static boolean sleepIgnoreFaker = false;
}
