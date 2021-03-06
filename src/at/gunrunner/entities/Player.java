package at.gunrunner.entities;

import java.awt.Graphics;

import at.gunrunner.abilitys.Weapon;
import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;
import at.gunrunner.physics.Playermovement;

public class Player extends Charakter {
	public int kills = 0; // kills from player
	public int health = 3; // player health
	private static float speedX = 0.03f;
	private static float jumpheight = 0.4f;
	public static Playermovement pm;
	@SuppressWarnings("unused")
	private int hitboxStart;//muss noch verwendet werden
	
	public static boolean lookingLeft;
	public static String waffe;
	
	public Player(int x, int y) {
		super(x, y, 100 -40, 140);
		hitboxStart = 25;
		pm = new Playermovement(Weapon.PISTOLE);
	}
	
	public Player(int x, int y, byte health,Weapon w) {
		super(x, y, 140, 100);
		this.health = health;
		pm = new Playermovement(w);
	}

	public void healthyboyy() {
		while(true)
		health++;
	}
	
	public void hit() {
		if(x-200 >= 0) {
			x -= 200;
		}else {
			x = 0;
		}
		health--;
	}
	
	@Override
	public void render(Graphics g) {
		if(Player.lookingLeft){
			switch(Playermovement.weapon) {
				case MP7 : g.drawImage(Resources.player1inv, (int)(x), (int)(Main.gw.player.y), 100, 140, null);break;
				case PISTOLE : g.drawImage(Resources.playerwpinv, (int)(x), (int)(y), 100, 140, null);break;
			}
			}else{
			switch(Playermovement.weapon) {
				case MP7  : g.drawImage(Resources.e, (int)(x), (int)(Main.gw.player.y), 100, 140, null);break;
				case PISTOLE  : g.drawImage(Resources.playerwp, (int)(x), (int)(y), 100, 140, null);break;
			}
			
		}
		
	}

	public static float getSpeedX() {
		return speedX;
	}
	
	public static float getJumpheight() {
		return jumpheight;
	}
}
