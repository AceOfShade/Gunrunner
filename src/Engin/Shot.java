package Engin;

public class Shot {
	double speedshot;
	int sX;
	int sY;
	boolean right;
	
	public Shot() {
		this.speedshot = 30;
		this.sX = Variables.px+75;
		this.sY = Variables.py+85;
		if(Variables.moveleft) {
			right = false;
		}else {
			right = true;
		}
	}
	public void Schuss(){
		if(right) {
			sX +=speedshot;
		}else {
			sX -= speedshot;
		}
	}
}
