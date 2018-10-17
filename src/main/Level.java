package main;

import java.util.ArrayList;
import entities.*;

public class Level {
	public Player p = new Player(350, 400);
	ArrayList<Enemy> ea = new ArrayList<Enemy>(1);
	
	public void levelLoader() { // so richtig falsch geschrieben
		if(p.x == 800) {
			
		}
	}
	
	public void createLvl(int lvl) {
		switch(lvl) {
		case 1: newEnemys(1);
		}
	}
	
	public void newEnemys(int amount) {
		for(int i = 0; i < amount; i++) {
			Enemy e = new Enemy(575 + i, 400);
			ea.add(e);
		}
	}
}
