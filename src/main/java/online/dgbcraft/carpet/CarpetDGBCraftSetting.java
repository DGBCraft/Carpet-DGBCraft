package online.dgbcraft.carpet;

import carpet.settings.Rule;

import static carpet.settings.RuleCategory.BUGFIX;
import static carpet.settings.RuleCategory.COMMAND;
import static carpet.settings.RuleCategory.SURVIVAL;

public class CarpetDGBCraftSetting {

    // Since gnembon has added a judgment to the carpet,
    // it should no longer be unable to enter the service because of calling a faker with a long name.
    /*
    @Rule(
        desc = "Prevent players from using /player to summon fake player whose name length exceeds the limit",
        extra = "Resolve the problem that the server cannot be accessed after the player summons a dummy with a name longer than 16 through restrictions",
        category = {BUGFIX, "Fake"}
    )
    public static int fakePlayerNameLengthLimit = 16;
     */

    public static final String FAKE_PLAYER_NAME_NO_PREFIX = "#none";

    @Rule(
        desc = "Prevent players from using /player to summon fake player whose names don't contain the prefix",
        extra = "Using the specified prefix is good for the server to manage fake players",
        options = {FAKE_PLAYER_NAME_NO_PREFIX, "bot_", "bot."},
        category = "Fake"
    )
    public static String fakePlayerNamePrefixLimit = FAKE_PLAYER_NAME_NO_PREFIX;

    @Rule(
        desc = "Modify permission level of /seed command",
        extra = "This rule does not affect the single player world",
        options = {"0", "1", "2", "3", "4"},
        category = COMMAND
    )
    public static String permissionLevelSeed = "2";

    @Rule(
        desc = "Ignore fake players when skipping the night by sleeping",
        category = {SURVIVAL, "Fake"}
    )
    public static boolean sleepIgnoreFaker = false;


}
