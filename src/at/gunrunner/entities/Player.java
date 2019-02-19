package at.gunrunner.entities;

import java.awt.Graphics;

import at.gunrunner.abilitys.Weapon;
import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;

public class Player extends GameObject {
	public int kills = 0; // kills from player
	public int health; // player health
	public float velY;
	public static int jumpheight = 250;

	public static float speedright = 0.5f;
	public static float speedleft = 0.5f;
	public static float speedjump = 0.6f;
	public static float speeddown = 0.75f;
	
	public static boolean lookingLeft;
	public String waffe;
	
	public Player(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
		this.velY = 0;
		this.waffe ="MP7";
//		player.schoolShooting = true; :)
	}
	
	public Player(int x, int y, byte health,String w) {
		super(x, y, 140, 100);
		this.health = health;
		this.waffe = w;
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
			switch(Weapon.name) {
				case"MP7" : g.drawImage(Resources.player1inv, (int)(x), (int)(Main.gw.player.y), 100, 140, null);break;
				case"Pistole" : g.drawImage(Resources.playerwpinv, (int)(x), (int)(y), 100, 140, null);break;
			}
			}else{
			switch(Weapon.name) {
				case"MP7" : g.drawImage(Resources.e, (int)(x), (int)(Main.gw.player.y), 100, 140, null);break;
				case"Pistole" : g.drawImage(Resources.playerwp, (int)(x), (int)(y), 100, 140, null);break;
			}
			
		}
		
	}

}
