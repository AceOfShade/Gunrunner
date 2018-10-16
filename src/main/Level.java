package main;

import java.util.ArrayList;
import entities.*;

public class Level {
	public Player p = new Player(350, 400);
	ArrayList<Enemy> ea = new ArrayList<Enemy>(1);
	
<<<<<<< HEAD
	public void levelactualisizer() { // so richtig falsch geschrieben
=======
	public void levelLoader() { // so richtig falsch geschrieben
>>>>>>> master
		if(p.x == 800) {
			
		}
	}
	
	public void createLvl(int lvl) {
		switch(lvl) {
<<<<<<< HEAD
		case 1: @SuppressWarnings("unused") Enemy e1 = new Enemy(675, 400);
=======
		case 1: newEnemys(1);
		}
	}
	
	public void newEnemys(int amount) {
		for(int i = 0; i < amount; i++) {
			Enemy e = new Enemy(575 + i, 400);
			ea.add(e);
>>>>>>> master
		}
	}
}
