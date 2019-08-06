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
					System.out.println(String.format("Px: %f, Py: %f, VelX: %f VelY %f", Main.gw.player.getX(), Main.gw.player.getY(), Main.gw.player.getVelX(), Main.gw.player.getVelY()));
				}
			}
		}, 0, 1);
	}
}