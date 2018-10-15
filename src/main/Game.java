package main;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import enteties.Collision;
import enteties.Movement;
import enteties.Player;
import enteties.Sprite;

public class Game {
	Timer g;
	Movement m = new Movement();
	
	
	
	public Game() {
		
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				m.shoot();
				m.move();
				
				if(Variables.debug) {
					System.out.println("Px" + Player.px);
					System.out.println("Py" + Player.py); 
				}
			}
	}, 0, 10);
		
		Sprite player = new Sprite(350, 400, Variables.player1, this);
		
<<<<<<< HEAD:src/Main/Game.java
		ArrayList<Sprite> objects = new ArrayList<Sprite>(200);
=======
		ArrayList<Sprite> objects = new ArrayList<Sprite>();
>>>>>>> 9e24ee4020dbe0df24f9b5fc8355d53029067c6f:src/main/Game.java
		//objects.addAll(Variables.playerSprites);
		objects.addAll(Variables.enemySprites);
		for(int i = 0; i < Variables.freePos; i++) {//muss fabian noch verbessern
		
		}
		for(int i = 0; i<objects.size(); i++) {
			if(Collision.rectangleRectangleCollision(player, objects.get(i))) {
				if(Variables.health>0) return;
				Variables.health--;
			}
		}
		
}

	public ArrayList<Sprite> getEnemys() {
		return Variables.enemySprites;
	}
	
	public ArrayList<Sprite> getPlayer() {
		return Variables.playerSprites;
	}
	
}
