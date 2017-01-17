package ca.dantav.game;

import java.util.logging.Logger;

import javax.swing.JFrame;

public final class Main {
	
	public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(Constants.GAME_DIMENSION);
		frame.setTitle(Constants.GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(Panel.PANEL);
		
		
	}

}
