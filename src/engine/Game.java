package engine;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
	Timer g;
	Movement m = new Movement();
	
	public Game() {
		
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				m.shoot();
				m.move();
			}
	}, 0, 10);
}

	public ArrayList<Sprite> getEnemys() {
		return Variables.enemySprites;
	}
}
