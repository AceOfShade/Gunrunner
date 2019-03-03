package at.gunrunner.entities;

import java.awt.Graphics;

import at.gunrunner.physics.GravityEngine;

public class PhysicsObject extends GameObject {
	public float velX;//muss zu private gemacht werden!
	protected float velY;

	public PhysicsObject(float x, float y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void render(Graphics g) {};
	
	public void applyGravity() {
		if(y >= 400) {
			y= 400;
			return;
		}
		this.velY -= GravityEngine.gravitySpeed;
	}

	public float getVelX() {
		return velX;
	}
	
	protected void setVelY(float y) {
		this.velY = y;
	}

	public float getVelY() {
		return velY;
	}
}
