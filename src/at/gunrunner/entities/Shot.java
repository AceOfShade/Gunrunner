package at.gunrunner.entities;

import java.awt.Graphics;

import at.gunrunner.abilitys.Weapon;
import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;

public class Shot extends GameObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.gw.player.x + Weapon.shotX, Main.gw.player.y + Weapon.shotY, 9, 9);
		this.speedshot = Weapon.speedshot;
		if(Player.lookingLeft) {
			right = false;
		}else {
			right = true;
		}
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