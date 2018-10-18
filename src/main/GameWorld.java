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
	}
			
	
	public void levelactualisizer() { // so richtig falsch geschrieben
		if (player.x >= 8wd  ada 00) {
			player.x = 0;
			Main.lbl.nextPic = true;
		}
	}
	
	public void levelgenerator() {
		
	}
	
}
