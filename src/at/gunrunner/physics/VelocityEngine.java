package at.gunrunner.physics;

import at.gunrunner.main.Main;

public class VelocityEngine{
	
	private float friction = 0.9f;
	
	public void allIsMoving() {
		bulletsAreMoving();
		walk();
		gravity();
		Playermovement.w.shoot(false);
	}
	
	private void bulletsAreMoving() {
		for(int i = 0; i < Main.gw.shotObjects.size(); i++) {
			if(Main.gw.shotObjects.get(i).right) {
				Main.gw.shotObjects.get(i).x += Main.gw.shotObjects.get(i).speedshot;
			}else {
				Main.gw.shotObjects.get(i).x -= Main.gw.shotObjects.get(i).speedshot;
			}
			if(Main.gw.shotObjects.get(i).getX() >= 800 || Main.gw.shotObjects.get(i).getX() <= 0) {
				Main.gw.shotObjects.remove(i);
			}
		}
	}
	
	private void gravity() {
		Main.gw.player.y -= Main.gw.player.getVelY();
		Main.gw.player.applyGravity();
	}
	
	private void walk() {
		if (Main.gw.player.x + Main.gw.player.velX > 0  && Main.gw.player.x + Main.gw.player.velX < 730) {
			Main.gw.player.x += Main.gw.player.velX;
		}
		if(Main.gw.player.getY() == 400) {
			if(Main.gw.player.velX != 0) {
				Main.gw.player.velX *= friction;
			}
		}
	}
}