package Engin;

import java.util.Timer;
import java.util.TimerTask;

public class Shotmov {
	int e = 0;
	Timer movment;
	public Shotmov() {
		movment=new Timer();
		movment.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				e++;
				if(Variables.shot && e >= 10) {Variables.shots[Variables.freePos] = new Shot(); Variables.freePos++; e=0;} //spawning
				
				
				for(int i = 0; i < Variables.freePos && Variables.freePos != 0; i++) { // despawn
					Variables.shots[i].sX += Variables.shots[i].speedshot;
					if(Variables.shots[i].sX >= Variables.screenwidth) {
						for(int a = i; a < Variables.freePos; a++) {
							Variables.shots[a]= Variables.shots[a+1];
						}
						Variables.freePos--;
					}
				}
				
				
				if(Variables.debug) {System.out.println("Anzahl Sch�sse:" +Variables.freePos);}//debug mode
				
			}
	}, 0, 10);
}
}

