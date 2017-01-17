package ca.dantav.game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import ca.dantav.game.gfx.GameButtons;
import ca.dantav.game.gfx.GameGraphics;

public final class Panel extends JPanel {
	
	
	public static final Panel PANEL = new Panel();
	
	private Game game;
	

	
	private Panel() {
		this.setVisible(true);
		this.setSize(Constants.GAME_DIMENSION);
		this.setLayout(null);
		this.setBackground(Constants.MAIN_SCREEN_BACKGROUND);
		
		this.game = new Game();
		
		
		load();
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(GameGraphics graphic : GameGraphics.values()) {
			
			if(graphic.getStage().equals(game.getStage())) {
				graphic.draw(g);
			}
			
		}
		
	}

	
	private final void load() {
	
		for(final GameButtons button : GameButtons.values()) {
			button.getButton().setSize(button.getRectangle().height, button.getRectangle().width);
			button.getButton().setLocation(button.getRectangle().x, button.getRectangle().y);
			button.getButton().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					button.execute();
					
				}
				
			});
			
			this.add(button.getButton());
		
		}
		
		new Thread(new GameThread()).start();
	}
	
	
	public Game getGame() {
		return game;
	}
	
}
