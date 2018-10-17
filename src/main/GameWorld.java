package main;

import java.util.ArrayList;

import entities.GameObject;
import entities.Player;

public class GameWorld {
	public Player player;
	public ArrayList<GameObject> objects;
	
	public GameWorld() {
		player = new Player(350, 400);
		objects = new ArrayList<>(2);
		objects.add(player);
	}
			
	
	public void levelactualisizer() { // so richtig falsch geschrieben
		if (player.x == 800) {

		}
	}
	
	
}
