package entities;

import main.*;

public class Shot extends GameObject{
	public double speedshot;
	public boolean right;
	
	public Shot() {
		super(Main.lvl.player.x+75, Main.lvl.player.y+85, 9, 9);
		this.speedshot = Variables.speedshot;
		if(Variables.moveleft) {
			right = false;
		}else {
			right = true;
		}
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	
}




