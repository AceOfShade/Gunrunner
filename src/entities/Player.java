package entities;

import java.awt.Graphics;

import abilitys.Weapon;
import inputs.Resources;
import main.Main;

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
		this.waffe ="Pistole";
//		waffe.schoolShooting = true;
	}
	
	public Player(int x, int y, byte health,String w) {
		super(x, y, 140, 100);
		this.health = health;
		this.waffe = w;
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
