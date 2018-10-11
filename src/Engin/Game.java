package Engin;

import java.util.Timer;
import java.util.TimerTask;

public class Game {
	Timer g;
	Player p = new Player();
	
	public Game() {
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				p.move();
				
			}
	}, 0, 10);
}
}
