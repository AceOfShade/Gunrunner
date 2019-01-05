package at.gunrunner.entities;

import java.awt.Graphics;

import at.gunrunner.abilitys.Idk;
import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;


public class Enemy extends GameObject {
	public Idk deathSymbole; 
	public int health;
	public boolean enemydead = false;
	public Enemy(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
	}

	public Enemy(int x, int y, int health) {
		super(x, y, 100, 140);
		this.deathSymbole = null;
		this.health = health;
	}
	
	public void hit(boolean instantDead) {
		if(instantDead) {
			health = 0;
			enemydead = true;
		}else if(!enemydead) {
			if(health>0) {
				health--;
			} 
			if(health == 0) {
				enemydead = true;
				Main.gw.player.kills++;
				Main.gw.idks.add(new Idk(x, y, false));
			}
		}
	}

	@Override
	public void render(Graphics g) {
		if(!enemydead) {
			g.drawImage(Resources.enemy, (int)(x), (int)(y), 100, 140, null);
		}else {
			g.drawImage(Resources.enemydead, (int)(x), (int)(y), 100, 140, null);
		}
		
	}
	

}