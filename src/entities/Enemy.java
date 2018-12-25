package entities;

import main.Main;

public class Enemy extends GameObject {
	public int x, y, health;
	public boolean enemydead = false;
	public Enemy(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
	}

	public Enemy(int x, int y, int health) {
		super(x, y, 100, 140);
		this.health = health;
	}
	
	public void hit() {
		if(!enemydead) {
			if(health>0) {
				health--;
			}else if(health == 0) {
				enemydead = true;
				Main.gw.player.kills++;
			}
		}
	}
	
	public void render() {

	}
}