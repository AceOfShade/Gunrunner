package entities;

import main.*;
import rendering.KeyHandler;

public class Shot extends GameObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.lvl.player.x+75, Main.lvl.player.y+85, 9, 9);
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




