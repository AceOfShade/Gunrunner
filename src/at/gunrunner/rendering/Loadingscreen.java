package at.gunrunner.rendering;

import java.util.*;

public class Loadingscreen{
	private static Timer t = new Timer();
	
	
	public static void load() {
		t.scheduleAtFixedRate(new TimerTask() { // wird erst später verwendet!!
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}, 0 , 100);
	}

}
