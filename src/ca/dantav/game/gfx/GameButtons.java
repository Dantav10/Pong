package ca.dantav.game.gfx;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import ca.dantav.game.Main;
import ca.dantav.game.Panel;
import ca.dantav.game.util.GameColours;

public enum GameButtons {

	START_GAME(new JButton("Start Game"), new Rectangle(245, 100, 100, 100)) {
		
		@Override
		public void execute() {
			
			
		}
		
	},
	
	MATCH_POINT(new JButton("Set Match Point"), new Rectangle(460, -2, 30, 145)) {
		
		@Override
		public void execute() {
			
			String name = JOptionPane.showInputDialog(Panel.PANEL,
                    "Type in the Match Point:", null);
			
			if(!name.matches("-?\\d+(\\.\\d+)?")) {
				Main.LOGGER.info("Please type in numbers");
				return;
			}
			
			int amount = Integer.parseInt(name);
			
			
			
			
			Panel.PANEL.getGame().setMatchPoint(amount);
			
			
		}
		
	},
	
	SET_PONG_1(new JButton("Set Pong 1 Colour"), new Rectangle(-10, 350, 30, 150)) {
		
		@Override
		public void execute() {
			
			String name = JOptionPane.showInputDialog(Panel.PANEL,
                    "Type in Pong 1 Colour:", null).toUpperCase();
			
			
			GameColours colour = null;
			
			for(GameButtons button : GameButtons.values()) {
				
				if(button.toString().equals(name)) {
					colour = button;
				}
				
			}
			
			
			
			
			
			Panel.PANEL.getGame().setMatchPoint(amount);
			
			
		}
		
	};
	
	
	
	
	private JButton button;
	private Rectangle rectangle;
	
	GameButtons(JButton button, Rectangle rectangle) {
		this.button = button;
		this.rectangle = rectangle;
	}
	
	public JButton getButton() {
		return button;
	}
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	
	public abstract void execute();
}
