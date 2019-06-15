package at.gunrunner.core.entities;

import java.awt.Graphics;

import at.gunrunner.core.inputs.Resources;
import at.gunrunner.core.main.*;
import at.gunrunner.core.physics.Playermovement;
import at.gunrunner.core.sound.WeaponSoundhandler;

public class Shot extends PhysicsObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.gw.player.x + Playermovement.weapon.shotXstart , Main.gw.player.y + Playermovement.weapon.shotYstart, 9, 9);
		this.speedshot = Playermovement.weapon.speedshot;
		if(Player.lookingLeft) {
			right = false;
		}else {
			right = true;
		}
		WeaponSoundhandler.playSound();
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