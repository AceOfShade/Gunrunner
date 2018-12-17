package abilitys;

public class Waffe {

	 public static int shotX = 0, shotY = 0;
	 
	public void waffe(String name) {
		switch(name) {
		case"MP7" : set(0,0,75,85);break;
		case"Pistole" : set(0,0,89,89);break;
		}
	}
		 
		 public void set(int x, int y, int shotX, int shotY) {
//			 this.x = x;
//			 this.y = y;
			 Waffe.shotX = shotX;
			 Waffe.shotY = shotY;
		 }
	
}
