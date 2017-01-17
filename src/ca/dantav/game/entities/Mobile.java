package ca.dantav.game.entities;

import java.awt.Graphics;
import java.awt.Point;


public abstract class Mobile {

	private Point point;
	
	public Mobile(Point point) {
		this.point = point;
	}
	
	public Point getPoint() {
		return point;
	}
	
	
	public abstract void render(Graphics g);
}
