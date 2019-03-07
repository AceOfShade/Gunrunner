package at.gunrunner.entities;

import java.awt.Graphics;

/**
 *
 * This is an Abstract Game object class used as a base for further implementations 
 */
public abstract class GameObject {	
	public float x, y;
	public int w, h;

	public GameObject(float x, float y, int w, int h) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public abstract void render(Graphics g);

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}
}