package at.gunrunner.main;

import java.util.Timer;
import java.util.TimerTask;

import at.gunrunner.inputs.KeyHandler;
import at.gunrunner.physics.VelocityEngine;
import at.gunrunner.rendering.Collision;

public class Game {
	public Timer g;
	public Collision c = new Collision();
	VelocityEngine ve;

	public Game() {
		g = new Timer();
		ve = new VelocityEngine();
	}
	
	public void startGame() {
		g.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				Main.gw.player.pm.checkForAction();
				ve.allIsMoving();
				c.testC();
				Main.gw.levelupdater();
				if (KeyHandler.f1Pressed) {
					System.out.println("Px: " + Main.gw.player.getX() + " Py: " + Main.gw.player.getY() + " VelX: " + Main.gw.player.getVelY() + " VelY: " + Main.gw.player.getVelY());
				}
			}
		}, 0, 1);
	}
}