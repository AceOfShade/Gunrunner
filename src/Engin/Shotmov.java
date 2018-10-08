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
				if(Variables.shot && e >= 10) {Variables.shots[Variables.freiePos] = new Shot(); Variables.freiePos++; e=0;} //spawning
				
				
				for(int i = 0; i < Variables.freiePos && Variables.freiePos != 0; i++) { 
						
						Variables.shots[i].Schuss();
						
					if(Variables.shots[i].sX >= Variables.screenwidth) {// despawn
						for(int a = i; a < Variables.freiePos; a++) {
							Variables.shots[a]= Variables.shots[a+1];
						}
						Variables.freiePos--;
					}
				}
				
				
				if(Variables.debug) {System.out.println("Anzahl Schüsse:" +Variables.freiePos);}//debug mode
				
			}
	}, 0, 10);
}
}

