package entities;

import sound.Sound;
import main.Main;
import main.Variables;

public class Movement {
	int jh; // max Sprunghöhe von Variables kopiert
	int e = 0;
	Sound s = new Sound();

	public void shoot() {// Schießen halt
		e++;
		if (Variables.shot && e > 5) {
			Variables.shots[Variables.freePos] = new Shot();
			Variables.freePos++;
			e = 0;
			s.playSound();
		} // spawning

		for (int i = 0; i < Variables.freePos && Variables.freePos != 0; i++) { // despawn
			Variables.shots[i].schuss();
			if (Variables.shots[i].sX > Variables.screenwidth || Variables.shots[i].sX <= 0) {
				for (int a = i; a < Variables.freePos; a++) {
					Variables.shots[a] = Variables.shots[a + 1];
				}
				Variables.freePos--;
				Variables.shots[Variables.freePos] = null;
			}
		}

		if (Variables.freePos >= 98) {
			Variables.freePos = 0;
			for (int i = 0; i < Variables.shots.length; i++) {
				Variables.shots[i] = null;
			}
		}

		if (Variables.debug) {
			System.out.println("Anzahl Schüsse:" + Variables.freePos);
		} // debug mode
	}

	public void move() {// bewegung
		if (Variables.moveright == true) {
			if (Main.lvl.player.x < 730) {
				Main.lvl.player.x += Variables.speedright;
			}
		}
		if (Variables.moveleft == true) {
			if (Main.lvl.player.x > 0) {
				Main.lvl.player.x -= Variables.speedleft;
			}
		}

		// Jump
if(Main.lvl.player.y >= 400) {jh = Variables.jumpheight; } // jump max höhe;
		
		if(Variables.moveup && jh != 0){
			if(Main.lvl.player.y>0 ){Variables.velY-=Variables.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Variables.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w hält)
		}
		if(Variables.velY == 0 && Main.lvl.player.y < 400) { //sinken
			Main.lvl.player.y+= Variables.speeddown; //sinken
		}
		 
		if(Variables.velY < 0 && jh > 0) { //steigen
			Main.lvl.player.y-= Variables.speedjump;
			Variables.velY++;
			jh--;
		}
		
		if(Main.lvl.player.y > 400){	//wenn man in den boden buggt
			Main.lvl.player.y = 400; 
			}
		//Jump-Ende
		if(Variables.debug) {System.out.println("Vel: " + Variables.velY + Variables.moveup);}//debug mode

	}
}
