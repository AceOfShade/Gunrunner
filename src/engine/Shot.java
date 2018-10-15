package engine;

public class Shot {
	double speedshot;
	int sX, sY;
	boolean right;
	
	public Shot() {
		this.speedshot = Variables.speedshot;
		this.sX = Player.px+75;
		this.sY = Player.py+85;
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




