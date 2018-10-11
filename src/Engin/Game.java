package Engin;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
	Timer g;
	Player p = new Player();
	Shot s = new Shot();
	int e = 0;
	
	public Game() {
		g=new Timer();
		g.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				p.move();
				
				
				
					e++;
					if(Variables.shot && e >= 10) {Variables.shots[Variables.freePos] = new Shot(); Variables.freePos++; e=0;} //spawning
					
					
					for(int i = 0; i < Variables.freePos && Variables.freePos != 0; i++) { 
							
							Variables.shots[i].schuss();
							
							for(int a = i; a < Variables.freePos; a++ ) {
								if(Variables.shots[i].sX >= Variables.screenwidth ) {// despawn
								Variables.shots[a]= Variables.shots[a+1];
							}
							Variables.freePos--;
						}
					}
					
					
					if(Variables.debug) {System.out.println("Count of shots:" +Variables.freePos);}//debug mode
				
				
			}
	}, 0, 10);
}

	public ArrayList<Sprite> getEnemys() {
		return Variables.enemySprites;
	}
}
