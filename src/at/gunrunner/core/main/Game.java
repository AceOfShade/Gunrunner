package at.gunrunner.core.main;

import java.util.Timer;
import java.util.TimerTask;

import at.gunrunner.core.entities.EnemyAI;
import at.gunrunner.core.inputs.KeyHandler;
import at.gunrunner.core.physics.VelocityEngine;
import at.gunrunner.core.rendering.Collision;

public class Game {
	public Timer g;
	public Timer aiTimer;
	public Collision c = new Collision();
	VelocityEngine ve;

	public Game() {
		aiTimer = new Timer();
		g = new Timer();
		ve = new VelocityEngine();
	}
	
	public void startGame() {
		aiTimer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				EnemyAI.live();
			}
		},0, 100);
		
		
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