package main;

import java.util.Timer;
import java.util.TimerTask;

import entities.Movement;
//import entities.Player;
//import rendering.Collision;
import rendering.Collision;

public class Game {
	Timer g;
	Movement m = new Movement();
	Collision c = new Collision();
	int tick;

	public void startGame() {
		g = new Timer();
		g.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				
				m.shoot();
				m.move();
				c.testC();
				Main.lvl.levelactualisizer();

				if (Variables.debug) {
					System.out.println("Px" + Main.lvl.player.x);
					System.out.println("Py" + Main.lvl.player.y);
				}
			}
		}, 0, 10);
	}
}
