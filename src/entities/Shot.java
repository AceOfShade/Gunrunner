package entities;

import main.*;

public class Shot{
	public double speedshot;
	public int sX;
	public int sY;
	public boolean right;
	
	public Shot() {
		this.speedshot = Variables.speedshot;
		this.sX = Main.lvl.player.x+75;
		this.sY = Main.lvl.player.y+85;
		if(Variables.moveleft) {
			right = false;
		}else {
			right = true;
		}
	}
	public void schuss(){
		if(right) {
			sX +=speedshot;
		}
		if(right==false) {
			sX -= speedshot;
		}
	}
	
	
}




