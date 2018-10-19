package main;

import java.util.Timer;
import java.util.TimerTask;

import entities.Movement;
//import entities.Player;
//import rendering.Collision;
import rendering.Collision;

public class Game {
	public Timer g;
	public Movement m = new Movement();
	public Collision c = new Collision();
	public int tick;

	public void startGame() {
		g = new Timer();
		g.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				
				m.move();
				c.testC();
				Main.lvl.levelactualisizer();
				if(Main.lbl.loadingscreentimer > 0 && Main.lbl.loadscreen) {
					Main.lbl.loadingscreentimer--;
				}

				if (Variables.debug) {
					System.out.println("Px" + Main.lvl.player.x);
					System.out.println("Py" + Main.lvl.player.y);
				}
			}
		}, 0, 10);
	}
}
