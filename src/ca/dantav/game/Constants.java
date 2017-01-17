package ca.dantav.game;

import java.awt.Color;
import java.awt.Dimension;

public final class Constants {

	private Constants() {
		throw new AssertionError();
	}
	
	public static final Dimension GAME_DIMENSION = new Dimension(600, 400);
	
	public static final Color MAIN_SCREEN_BACKGROUND = Color.YELLOW;
	
	public static final String GAME_TITLE = "Pong";
}
