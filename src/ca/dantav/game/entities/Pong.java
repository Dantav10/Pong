package ca.dantav.game.entities;

import java.awt.Graphics;
import java.awt.Point;

import ca.dantav.game.util.GameColours;


public class Pong extends Mobile {

	private int points;
	
	private GameColours color;
	
	public Pong(Point point) {
		super(point);
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public GameColours getColor() {
		return color;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setColor(GameColours color) {
		this.color = color;
	}

}
