package engine;

public class Movement {
	int jh; //max Sprunghöhe von Variables kopiert
	int e = 0;
	
	public void schiessen() {//Schießen halt
		e++;
		if(Variables.shot&& e > 5) {Variables.shots[Variables.freePos] = new Shot(); Variables.freePos++; e = 0;;} //spawning

		for(int i = 0; i < Variables.freePos && Variables.freePos != 0; i++) { // despawn
			Variables.shots[i].schuss();
			if(Variables.shots[i].sX > Variables.screenwidth|| Variables.shots[i].sX <0) {
				for(int a = i; a < Variables.freePos; a++) {
					Variables.shots[a]= Variables.shots[a+1];
				}
				Variables.freePos--;
			}
		}


		if(Variables.debug) {System.out.println("Anzahl Schüsse:" +Variables.freePos);}//debug mode
	}
	
	
	
	public void bewegen() {//bewegung
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
	}
}
