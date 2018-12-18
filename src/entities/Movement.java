package entities;

import inputs.KeyHandler;
import main.Main;
import main.Variables;
import sound.Sound;

public class Movement {
	int jh; // max Sprunghöhe von Variables kopiert
	int e = 0;
	Sound s;
	
	public Movement() {
		s = new Sound();
	}

	public void shoot() {// Schießen halt
	 	
		 // spawning

		if(KeyHandler.spacePressed)
			e++;
		if (e > 200) {
			Shot a = new Shot();
			Main.lvl.shotObjects.add(a);
			System.out.println(Main.lvl.shotObjects.size());
			e = 0;
			s.playSound();
		}
		for(int i = 0; i < Main.lvl.shotObjects.size(); i++) {
			if(Main.lvl.shotObjects.get(i).right) {
				Main.lvl.shotObjects.get(i).x += Main.lvl.shotObjects.get(i).speedshot;
			}else {
				Main.lvl.shotObjects.get(i).x -= Main.lvl.shotObjects.get(i).speedshot;
			}
			if(Main.lvl.shotObjects.get(i).getX() >= 800 || Main.lvl.shotObjects.get(i).getX() < 0) {
				Main.lvl.shotObjects.remove(i);
			}	
		}
	}

	public void move() {// bewegung
		if (KeyHandler.dPressed) {
			if (Main.lvl.player.x < 730) {
				Main.lvl.player.x += Player.speedright;
			}
		}
		if (KeyHandler.aPressed) {
			if (Main.lvl.player.x > 0) {
				Main.lvl.player.x -= Player.speedleft;
			}
		}

		// Jump
		if(Main.lvl.player.y >= 400) {jh = Player.jumpheight; } // jump max höhe;
		
		if(KeyHandler.wPressed && jh != 0){
			if(Main.lvl.player.y>0 ){Main.lvl.player.velY-=Player.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Main.lvl.player.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w hält)
		}
		if(Main.lvl.player.velY == 0 && Main.lvl.player.y < 400) { //sinken
			Main.lvl.player.y+= Player.speeddown; //sinken
		}
		 
		if(Main.lvl.player.velY < 0 && jh > 0) { //steigen
			Main.lvl.player.y-= Player.speedjump;
			Main.lvl.player.velY++;
			jh--;
		}
		
		if(Main.lvl.player.y > 400){	//wenn man in den boden buggt
			Main.lvl.player.y = 400;
			}
		//Jump-Ende
		if(KeyHandler.f1Pressed) {System.out.println("Vel: " + Main.lvl.player.velY + KeyHandler.wPressed);}//debug mode
	}
}
