package main;

import java.util.ArrayList;

import entities.Enemy;
import entities.Player;
import entities.Shot;

public class GameWorld {
	public Player player;
	public ArrayList<Enemy> enemyObjects;
	public ArrayList<Shot> shotObjects;
	
	public GameWorld() {
		player = new Player(350, 400);
		enemyObjects = new ArrayList<>(2);
		shotObjects = new ArrayList<>(20);
		Enemy e = new Enemy(700, 400);
		enemyObjects.add(e);
	}
			
	
	
	  	public void levelupdater() { // so richtig falsch geschrieben
	 
		}
	
		public void levelgenerator() {
		
		}
	
}
