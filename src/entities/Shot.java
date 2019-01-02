package entities;

import java.awt.Graphics;

import abilitys.Weapon;
import main.Main;
import main.Variables;

public class Shot extends GameObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.gw.player.x + Weapon.shotX, Main.gw.player.y + Weapon.shotY, 9, 9);
		this.speedshot = Variables.speedshot;
		if(Player.lookingLeft) {
			right = false;
		}else {
			right = true;
		}
	}

	@Override
	public void render(Graphics g) {
			if (right) {
			g.drawImage(Variables.bullet, (int)(x), (int)(y), 9, 9, null);
		}else {
			g.drawImage(Variables.bulletinv, (int)(x), (int)(y), 9, 9, null);
		}
	}
	
	
	
}