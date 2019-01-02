package entities;

import java.awt.Graphics;

import main.Main;
import main.Variables;

public class Enemy extends GameObject {
	public int health;
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

	@Override
	public void render(Graphics g) {
		if(health != 0) {
			g.drawImage(Variables.enemy, (int)(x), (int)(y), 100, 140, null);
		}else {
			g.drawImage(Variables.enemydead, (int)(x), (int)(y), 100, 140, null);
		}
		
	}
	

}