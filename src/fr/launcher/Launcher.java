package fr.launcher;

import java.io.File;

import fr.theshark34.openlauncherlib.launcher.GameInfos;
import fr.theshark34.openlauncherlib.launcher.GameTweak;
import fr.theshark34.openlauncherlib.launcher.GameType;
import fr.theshark34.openlauncherlib.launcher.GameVersion;

public class Launcher {

	public static final GameVersion P_VERSION = new GameVersion("1.12.2", GameType.V1_8_HIGHER);
	public static final GameInfos P_INFOS = new GameInfos("Paradoxal", P_VERSION, true, new GameTweak[]{GameTweak.FORGE});
	public static final File P_DIR =  P_INFOS.getGameDir();
}
