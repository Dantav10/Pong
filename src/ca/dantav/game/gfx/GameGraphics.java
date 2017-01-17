package ca.dantav.game.gfx;

import java.awt.Graphics;

import ca.dantav.game.Panel;
import ca.dantav.game.world.Stage;

public enum GameGraphics {

	MATCH_POINT(Stage.MAIN_SCREEN) {

		@Override
		public void draw(Graphics g) {
			
			g.drawString("Match Point: " + Panel.PANEL.getGame().getMatchPoint(), 0, 10);
			
		}
		
	};
	
	private Stage stage;
	
	GameGraphics(Stage stage) {
		this.stage = stage;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	public abstract void draw(Graphics g);
}
