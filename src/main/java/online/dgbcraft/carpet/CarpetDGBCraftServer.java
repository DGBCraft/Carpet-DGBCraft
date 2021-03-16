package online.dgbcraft.carpet;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.settings.SettingsManager;

public class CarpetDGBCraftServer implements CarpetExtension {
    private static final String VERSION = "1.0.0";
    private static final String ID = "carpet-dgbcraft";
    private static final String NAME = "Carpet DGBCraft";

    private static SettingsManager settingManager;
    public static void register()
    {
        settingManager = new SettingsManager(VERSION, ID, NAME);
        CarpetServer.manageExtension(new CarpetDGBCraftServer());
    }

    public String getVersion() {
        return ID;
    }

    @Override
    public void onGameStarted() {

        CarpetServer.settingsManager.parseSettingsClass(CarpetDGBCraftSetting.class);

    }
}
