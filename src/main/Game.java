package main;

import java.util.Timer;
import java.util.TimerTask;

import entities.Movement;
//import entities.Player;
//import rendering.Collision;
import rendering.Collision;
import rendering.KeyHandler;

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
				
//				if(startcounting) {// unnötig
//					if(0 == 0) {
//						i = 1;
//					}else if(i > a) {
//						i = 0;
//					}
//				}
				m.shoot();
				m.move();
				c.testC();
				Main.lvl.levelupdater();
				if(Main.lbl.loadingscreentimer > 0 && Main.lbl.loadscreen) {
					Main.lbl.loadingscreentimer--;
				}

				if (KeyHandler.f1Pressed) {
					System.out.println("Px" + Main.lvl.player.x);
					System.out.println("Py" + Main.lvl.player.y);
				}
			}
		}, 0, 1);
	}
}
