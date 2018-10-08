package Engin;

public class Playermov {
	int jh; //max Sprunghöhe von Variables kopiert
	
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
		if(Variables.py >= 400) {jh = Variables.jumpheight; } // jump max höhe;
		
		if(Variables.moveup && jh != 0){
			if(Variables.py>0 ){Variables.velY-=Variables.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Variables.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w hält)
		}
		if(Variables.velY == 0 && Variables.py < 400) { //sinken
			Variables.py+= Variables.speeddown; //sinken
		}
		 
		if(Variables.velY < 0 && jh > 0) { //steigen
			Variables.py-= Variables.speedjump;
			Variables.velY++;
			jh--;
		}
		
		if(Variables.py > 400){	//wenn man in den boden buggt
				Variables.py = 400; 
			}
		//Jump-Ende
		if(Variables.debug) {System.out.println("Vel: " + Variables.velY + Variables.moveup);}//debug mode
		
		if(Collision.rectangleRectangleCollision(Variables.py, Variables.ey)) {
			
		}
	}
}