package entities;

import abilitys.Waffe;
import main.*;
import rendering.KeyHandler;

public class Shot extends GameObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.lvl.player.x + Waffe.shotX, Main.lvl.player.y + Waffe.shotY, 9, 9);
		this.speedshot = Variables.speedshot;
		if(KeyHandler.aPressed) {
			right = false;
		}else {
			right = true;
		}
	}
	
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	
}




