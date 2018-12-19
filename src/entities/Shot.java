package entities;

import abilitys.Weapon;
import main.*;

public class Shot extends GameObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.lvl.player.x + Weapon.shotX, Main.lvl.player.y + Weapon.shotY, 9, 9);
		this.speedshot = Variables.speedshot;
		if(Player.lookingLeft) {
			right = false;
		}else {
			right = true;
		}
	}
	
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	
}