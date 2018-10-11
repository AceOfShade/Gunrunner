package Engin;

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
				m.schiessen();
				m.bewegen();
			}
	}, 0, 10);
}

	public ArrayList<Sprite> getEnemys() {
		return Variables.enemySprites;
	}
}
