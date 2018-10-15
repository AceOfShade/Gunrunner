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
				
				if(Variables.debug) {
					System.out.println("Px" + Player.px);
					System.out.println("Py" + Player.py); 
				}
			}
	}, 0, 10);
}

	public ArrayList<Sprite> getEnemys() {
		return Variables.enemySprites;
	}
}
