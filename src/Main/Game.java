package main;

import java.util.Timer;
import java.util.TimerTask;

import entities.Movement;
import entities.Player;
import rendering.Collision;

public class Game {
	Timer g;
	Movement m = new Movement();
	Collision c = new Collision();
	int tick;
	

	public void startGame() {
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					if(!Variables.loadscreen) {
						tick++;
						if(tick == 100) {
							Variables.loadscreen = true;
						}
					}
					m.shoot();
					m.move();
					c.testC();
					
					if(Variables.debug) {
						System.out.println("Px" + Player.x);
						System.out.println("Py" + Player.y); 
					}
				}
		}, 0, 10);
	}
}
