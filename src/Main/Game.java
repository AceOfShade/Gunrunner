package main;

import java.util.Timer;
import java.util.TimerTask;

import enteties.Movement;
import enteties.Player;
import rendering.Collision;

public class Game {
	Timer g;
	Movement m = new Movement();
	Collision c = new Collision();
	
	
	
	public Game() {
		
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				m.shoot();
				m.move();
				c.testC();
				
				if(Variables.debug) {
					System.out.println("Px" + Player.px);
					System.out.println("Py" + Player.py); 
				}
			}
	}, 0, 10);
	}
}
