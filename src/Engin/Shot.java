package Engin;

public class Shot {
	double speedshot;
	int sX;
	int sY;
	boolean right;
	
	public Shot() {
		this.speedshot = Variables.speedshot;
		this.sX = Variables.px+75;
		this.sY = Variables.py+85;
		if(Variables.moveleft) {
			right = false;
		}else {
			right = true;
		}
	}
	public void schuss(){
		if(right) {
			sX +=speedshot;
		}else {
			sX -= speedshot;
		}
	}
	
	
}




