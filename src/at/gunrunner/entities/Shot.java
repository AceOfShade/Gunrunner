package at.gunrunner.entities;

import java.awt.Graphics;

import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;
import at.gunrunner.sound.Sound;

public class Shot extends PhysicsObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.gw.player.x + Main.gw.player.pm.weapon.shotXstart , Main.gw.player.y + Main.gw.player.pm.weapon.shotYstart, 9, 9);
		this.speedshot = Main.gw.player.pm.weapon.speedshot;
		if(Player.lookingLeft) {
			right = false;
		}else {
			right = true;
		}
		Sound.playSound();
	}

	@Override
	public void render(Graphics g) {
			if (right) {
			g.drawImage(Resources.bullet, (int)(x), (int)(y), 9, 9, null);
		}else {
			g.drawImage(Resources.bulletinv, (int)(x), (int)(y), 9, 9, null);
		}
	}
	
	
	
}