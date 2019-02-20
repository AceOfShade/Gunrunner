package at.gunrunner.main;

import java.util.Timer;
import java.util.TimerTask;

import at.gunrunner.inputs.KeyHandler;
import at.gunrunner.rendering.Collision;

public class Game {
	public Timer g;
	public Collision c = new Collision();

	public Game() {
		g = new Timer();
	}
	
	public void startGame() {
		g.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				
				Main.gw.player.pm.shoot();
				Main.gw.player.pm.move();
				c.testC();
				Main.gw.levelupdater();

				if (KeyHandler.f1Pressed) {System.out.println("Px: " + Main.gw.player.x + " Py: " + Main.gw.player.y);}
			}
		}, 0, 1);
	}
}