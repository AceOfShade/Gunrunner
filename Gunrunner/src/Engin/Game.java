package Engin;

import java.util.Timer;
import java.util.TimerTask;

public class Game {
	Timer g;
	Playermov pv = new Playermov();
	
	public Game() {
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				pv.move();
				
			}
	}, 0, 10);
}
}
