package Engin;

public class Playermove {
	int jh; //max jumpheight copied from Variables 
	
	public void move(){
		if(Variables.moveright==true)
		{	if(Variables.px<730){					
				Variables.px+=Variables.speedright;
		}
		}
		if(Variables.moveleft==true){
		if(Variables.px>0)
		{
		Variables.px-=Variables.speedleft;
				}
		}
		//Jump
		if(Variables.py >= 400) {jh = Variables.jumpheight; } // jump max height;
		
		if(Variables.moveup && jh != 0){
			if(Variables.py>0 ){Variables.velY-=Variables.speedjump; } //Jump add full (full Sprung)
		}else {
			Variables.velY = 0; //Jump add (not full Jump, until you release w)
		}
		if(Variables.velY == 0 && Variables.py < 400) { //falling down
			Variables.py+= Variables.speeddown; 
		}
		 
		if(Variables.velY < 0 && jh > 0) { //jumping up
			Variables.py-= Variables.speedjump;
			Variables.velY++;
			jh--;
		}
		
		if(Variables.py > 400){	//if stuck in floor
				Variables.py = 400; 
			}
		//Jump-End
		if(Variables.debug) {System.out.println("Vel: " + Variables.velY + Variables.moveup);}//debug mode
	}
}