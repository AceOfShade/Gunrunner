package at.gunrunner.physics;

import at.gunrunner.abilitys.Weapon;
import at.gunrunner.entities.Player;
import at.gunrunner.inputs.KeyHandler;
import at.gunrunner.main.*;

public class Playermovement {
	public static Weapon w = new Weapon();

	public Playermovement(String waffe) {
		w.waffe(waffe);
	}
	
	public void checkForAction() {
		shoot();
		move();
		jump();
	}
	
	public void shoot() {
		if(KeyHandler.spacePressed) {
			w.shoot(true);
		}
	}

	public void move() {// Movement
		if(Main.gw.player.getY() >= 399) {
			if (KeyHandler.aPressed) {
					Main.gw.player.velX -= Player.getSpeedX();
					return;
			}
			if(KeyHandler.dPressed){
					Main.gw.player.velX += Player.getSpeedX();
			}
		}
	}
	
	public void jump() {
		if(KeyHandler.wPressed) {
			Main.gw.player.jump(Player.getJumpheight());
		}
	}
}
