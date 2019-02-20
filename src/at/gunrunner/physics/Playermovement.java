package at.gunrunner.physics;

import at.gunrunner.abilitys.Weapon;
import at.gunrunner.entities.Player;
import at.gunrunner.entities.Shot;
import at.gunrunner.inputs.KeyHandler;
import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;

public class Playermovement {
	int cooltime = Weapon.cooldown;
	public static Weapon w = new Weapon();
	
	public static float speedRight = 0.1f;
	public static float speedLeft = 0.1f;

	public Playermovement(String waffe) {
		w.waffe(waffe);
	}
	
	public void shoot() {
		//spawning
		if(cooltime <= Weapon.cooldown) {
			cooltime++;
		}
		if (cooltime > Weapon.cooldown) {
			 if(KeyHandler.spacePressed) {
				Main.gw.shotObjects.add(new Shot());
				cooltime = 0;
				Resources.s.playSound();
			}
		}
		//"flying"
		for(int i = 0; i < Main.gw.shotObjects.size(); i++) {
			if(Main.gw.shotObjects.get(i).right) {
				Main.gw.shotObjects.get(i).x += Main.gw.shotObjects.get(i).speedshot;
			}else {
				Main.gw.shotObjects.get(i).x -= Main.gw.shotObjects.get(i).speedshot;
			}
			if(Main.gw.shotObjects.get(i).getX() >= 800 || Main.gw.shotObjects.get(i).getX() <= 0) {
				Main.gw.shotObjects.remove(i);
			}
		}
	}

	public void move() {// bewegung
		if (KeyHandler.dPressed) {
			if (Main.gw.player.x < 730) {
				Main.gw.player.x += Player.getSpeedX();
			}
		}
		if (KeyHandler.aPressed) {
			if (Main.gw.player.x > 0) {
				Main.gw.player.x -= Player.getSpeedX();
			}
		}
		
		Main.gw.player.y -= Main.gw.player.getVelY();
		Main.gw.player.applyGravity();
		// Jump
		/*
		if(Main.gw.player.y >= 400) {jh = Player.jumpheight; } // jump max h�he;
		
		if(KeyHandler.wPressed && jh != 0){
			if(Main.gw.player.y>0 ){Main.gw.player.velY-=Player.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Main.gw.player.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w h�lt)
		}
		if(Main.gw.player.velY == 0 && Main.gw.player.y < 400) { //sinken
			Main.gw.player.y+= Player.speeddown; //sinken
		}
		 
		if(Main.gw.player.velY < 0 && jh > 0) { //steigen
			Main.gw.player.y-= Player.speedjump;
			Main.gw.player.velY++;
			jh--;
		}
		
		if(Main.gw.player.y > 400){	//wenn man in den boden buggt
			Main.gw.player.y = 400;
			}
		*/
		//Jump-Ende
//		if(KeyHandler.f1Pressed) {System.out.println("Vel: " + Main.gw.player.velY + KeyHandler.wPressed);}//debug mode
	}
}
