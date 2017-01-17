package ca.dantav.game;

import java.awt.Point;

import ca.dantav.game.entities.Pong;
import ca.dantav.game.world.Stage;

public final class Game {

	private int matchPoint;
	
	private Stage stage = Stage.MAIN_SCREEN;
	
	private Pong[] pongs = {};
	
	
	public int getMatchPoint() {
		return matchPoint;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	public void setMatchPoint(int matchPoint) {
		this.matchPoint = matchPoint;
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
