package com.ids.proyecto_final.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ids.proyecto_final.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Nombre del juego";
		config.width = 900;
		config.height = 580;
		new LwjglApplication(new Game(), config);
	}
}
