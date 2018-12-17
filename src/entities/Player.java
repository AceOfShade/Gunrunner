package entities;

import abilitys.Waffe;

public class Player extends GameObject {
	public int kills = 0; // kills from player
	public int health; // player health
	float velY;
	public static int jumpheight = 250;
	public Waffe waffe = new Waffe();
	
	public Player(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
		velY = 0;
		waffe.waffe("Pistole");
//		waffe.school.shooting(true);
	}
	
	public Player(int x, int y, byte health,String w) {
		super(x, y, 140, 100);
		this.health = health;
		waffe .waffe(w);
	}

	public void render() {
		
		
	}
}
