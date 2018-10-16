package entities;

import main.*;

public class Shot{
	public double speedshot;
	public int sX;
	public int sY;
	public boolean right;
	
	public Shot() {
		this.speedshot = Variables.speedshot;
<<<<<<< HEAD
		this.sX = Player.px+75;
		this.sY = Player.py+85;
=======
		this.sX = Main.lvl.p.x+75;
		this.sY = Main.lvl.p.y+85;
>>>>>>> master
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




