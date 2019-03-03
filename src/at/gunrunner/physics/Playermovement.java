package at.gunrunner.physics;

import at.gunrunner.abilitys.Weapon;
import at.gunrunner.entities.Player;
import at.gunrunner.entities.Shot;
import at.gunrunner.inputs.KeyHandler;
import at.gunrunner.main.*;

public class Playermovement {
	int cooldown;
	public Weapon weapon2 = Weapon.PISTOLE;

	public Playermovement(String waffe) {
		cooldown = 0;
	}
	
	public void checkForAction() {
		shoot();
		move();
		jump();
	}
	
	public void shoot() {
			if(cooldown < weapon2.cooldowntime){
				cooldown++;
			}
		if(KeyHandler.spacePressed && cooldown == weapon2.cooldowntime) {
			Main.gw.shotObjects.add(new Shot());
			cooldown = 0;
			return;
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
