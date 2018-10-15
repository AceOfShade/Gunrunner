package Main;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Enteties.Collision;
import Enteties.Movement;
import Enteties.Player;
import Enteties.Sprite;

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
		
		ArrayList<Sprite> objects = new ArrayList<Sprite>(200);
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
	
	
}
