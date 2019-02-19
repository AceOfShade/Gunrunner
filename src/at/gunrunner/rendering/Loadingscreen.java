package at.gunrunner.rendering;

import java.util.*;

public class Loadingscreen{
	static Timer t;
	public static void load() {
		t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() { // wird erst später verwendet!!
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}, 0 , 100);
	}

}
