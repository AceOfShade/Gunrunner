package at.gunrunner.core.main;


import java.util.ArrayList;

import at.gunrunner.core.abilitys.HitMarker;
import at.gunrunner.core.entities.Enemy;
import at.gunrunner.core.entities.Player;
import at.gunrunner.core.entities.Shot;
import at.gunrunner.core.rendering.Label;

public class GameWorld {
	public static int lvl = 1;
	public Player player;
	public ArrayList<HitMarker> hitmarker;
	public ArrayList<Enemy> enemyObjects;
	public ArrayList<Shot> shotObjects;
	
	public GameWorld() {
		hitmarker = new ArrayList<>();
		player = new Player(350, 400);
		enemyObjects = new ArrayList<>();
		shotObjects = new ArrayList<>();
		levelgenerator();
	}
			
	
	
	  	public void levelupdater() {
	  		if(player.x + player.w >= 800) {
	  			levelfinished();
	  		}
		}
	  	
	  	public void levelfinished() {
	  		hitmarker.clear();
	  		enemyObjects.clear();
	  		shotObjects.clear();
	  		player.x = 0;
	  		Label.pic++;
	  		levelgenerator();
	  	}
	
		public void levelgenerator() {
			switch(Label.pic) {
			case 1: 
				enemyObjects.add(new Enemy(600,400));
				enemyObjects.add(new Enemy(700,400));
			break;case 2: 
				enemyObjects.add(new Enemy(600,400));
				enemyObjects.add(new Enemy(700,400));
			break;case 3:
				enemyObjects.add(new Enemy(500,400));
				enemyObjects.add(new Enemy(600,400));
				enemyObjects.add(new Enemy(700,400));
			}
		}
	
}
