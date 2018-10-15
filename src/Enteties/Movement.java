package Enteties;

import Main.Variables;
import engine.Sound;

public class Movement {
	int jh; //max Sprungh�he von Variables kopiert
	int e = 0;
	Sound s =new Sound();
	
	public void shoot() {//Schie�en halt
		e++;
		if(Variables.shot&& e > 5) {Variables.shots[Variables.freePos] = new Shot(); Variables.freePos++; e = 0; s.playSound();} //spawning
		

		for(int i = 0; i < Variables.freePos && Variables.freePos != 0; i++) { // despawn
			Variables.shots[i].schuss();
			if(Variables.shots[i].sX > Variables.screenwidth || Variables.shots[i].sX <= 0) {
				for(int a = i; a < Variables.freePos; a++) {
					Variables.shots[a]= Variables.shots[a+1];
				}
				Variables.freePos--;
				Variables.shots[Variables.freePos] = null;
			}
		}
		
		if(Variables.freePos == 98) {
			Variables.freePos = 0;
			for(int i = 0; i < Variables.shots.length; i++) {
				Variables.shots[i]= null;
			}
		}


		if(Variables.debug) {System.out.println("Anzahl Sch�sse:" +Variables.freePos);}//debug mode
	}
	
	
	
	public void move() {//bewegung
		if(Variables.moveright==true)
		{	if(Player.px<730){					
			Player.px+=Variables.speedright;
		}
		}
		if(Variables.moveleft==true){
		if(Player.px>0)
		{
			Player.px-=Variables.speedleft;
				}
		}
		
		//Jump
				if(Player.py >= 400) {jh = Variables.jumpheight; } // jump max h�he;
				
				if(Variables.moveup && jh != 0 && Player.py  == 400){
					Variables.velY-=Variables.speedjump;  //Sprung ges. hinzugeben (voller Sprung)
				}else {
					Variables.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w h�lt)
				}
				if(Variables.velY == 0 && Player.py < 400) { //sinken
					Player.py+= Variables.speeddown; //sinken
				}
				 
				if(Variables.velY < 0 && jh > 0) { //steigen
					Player.py-= Variables.speedjump;
					Variables.velY++;
					jh--;
				}
				
				if(Player.py > 400){	//wenn man in den boden buggt
					Player.py = 400; 
					}
				//Jump-Ende
				if(Variables.debug) {System.out.println("Vel: " + Variables.velY + Variables.moveup);}//debug mode
			
		
	}
}
