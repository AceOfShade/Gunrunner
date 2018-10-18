package entities;

import sound.Sound;

import java.util.Collection;

import main.Main;
import main.Variables;

public class Movement {
	int jh; // max Sprunghöhe von Variables kopiert
	int e = 0;
	Sound s = new Sound();
	

	public void shoot() {// Schießen halt
		Shot a = new Shot();
		e++;
		if (Variables.shot && e > 5) {
			Main.lvl.shotObjects.add(a);
			e = 0;
			s.playSound();
		} // spawning

		for(int i = 0; i < Main.lvl.shotObjects.size(); i++) {
			if(Main.lvl.shotObjects.get(i).right) {
				Main.lvl.shotObjects.get(i).x += Main.lvl.shotObjects.get(i).speedshot;
			}else {
				Main.lvl.shotObjects.get(i).x -= Main.lvl.shotObjects.get(i).speedshot;
			}
			if(Main.lvl.shotObjects.get(i).getX() >= 800) {
				Main.lvl.shotObjects.remove(i);
			}
			
		}
		
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
			if(Main.lvl.player.y>0 ){Main.lvl.player.velY-=Variables.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Main.lvl.player.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w hält)
		}
		if(Main.lvl.player.velY == 0 && Main.lvl.player.y < 400) { //sinken
			Main.lvl.player.y+= Variables.speeddown; //sinken
		}
		 
		if(Main.lvl.player.velY < 0 && jh > 0) { //steigen
			Main.lvl.player.y-= Variables.speedjump;
			Main.lvl.player.velY++;
			jh--;
		}
		
		if(Main.lvl.player.y > 400){	//wenn man in den boden buggt
			Main.lvl.player.y = 400;
			}
		//Jump-Ende
		if(Variables.debug) {System.out.println("Vel: " + Main.lvl.player.velY + Variables.moveup);}//debug mode

	}
}
