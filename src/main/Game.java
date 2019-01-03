package main;

import java.util.Timer;
import java.util.TimerTask;

import entities.Movement;
import inputs.KeyHandler;
//import entities.Player;
//import rendering.Collision;
import rendering.Collision;

public class Game {
	public Timer g;
	public Movement m = new Movement();
	public Collision c = new Collision();
	public int tick;
	int i = 0;
	static int a = 0;
	static boolean startcounting;

	public void startGame() {
		g = new Timer();
		g.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				
				m.shoot();
				m.move();
				c.testC();
				Main.gw.levelupdater();
				if(Main.lbl.loadingscreentimer > 0 && Main.lbl.loadscreen) {
					Main.lbl.loadingscreentimer--;
				}

				if (KeyHandler.f1Pressed) {
					System.out.println("Px" + Main.gw.player.x);
					System.out.println("Py" + Main.gw.player.y);
				}
			}
		}, 0, 1);
	}
}
