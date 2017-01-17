package ca.dantav.game.util;

import java.awt.Color;

public enum GameColours {

	BLUE(Color.BLUE);
	
	private Color color;
	
	GameColours(Color color) {
		this.color = color;
	}
	
	public Color getColour() {
		return color;
	}
	
}
