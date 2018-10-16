package main;

import java.util.ArrayList;
import entities.*;

public class Level {
	public Player p = new Player(350, 400);
	ArrayList<Enemy> ea = new ArrayList<Enemy>(1);
	
	public void levelactualisizer() { // so richtig falsch geschrieben
		if(p.x == 800) {
			
		}
	}
	
	public void createLvl(int lvl) {
		switch(lvl) {
		case 1: @SuppressWarnings("unused") Enemy e1 = new Enemy(675, 400);
		}
	}
}
