package at.gunrunner.main;


import java.util.ArrayList;

import at.gunrunner.abilitys.HitMarker;
import at.gunrunner.entities.Enemy;
import at.gunrunner.entities.Player;
import at.gunrunner.entities.Shot;

public class GameWorld {
	public static int lvl = 1;
	public Player player;
	public ArrayList<HitMarker> idks;
	public ArrayList<Enemy> enemyObjects;
	public ArrayList<Shot> shotObjects;
	
	public GameWorld() {
		idks = new ArrayList<>();
		player = new Player(350, 400);
		enemyObjects = new ArrayList<Enemy>(1);
		shotObjects = new ArrayList<>(5);
		levelgenerator();
	}
			
	
	
	  	public void levelupdater() { // so richtig falsch geschrieben
	  		for(int i = 0; i < Main.gw.idks.size(); i++) {
				if(Main.gw.idks.get(i).way < 0) {
					Main.gw.idks.remove(i);
				}
			}
		}
	
		public void levelgenerator() {
			switch(lvl) {
			case 1: enemyObjects.add(new Enemy(600,400));
					enemyObjects.add(new Enemy(700,400)); break;
			}
		}
	
}
