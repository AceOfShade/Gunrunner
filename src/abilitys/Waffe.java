package abilitys;

public class Waffe {

	 public int x, y;
	 public int shotX, shotY;
	 
	public void waffe(String name) {
		switch(name) {
		case"MP7" : set(0,0,0,0);break;
		case"Pistole" : set(0,0,89,73);break;
		}
	}
		 
		 public void set(int x, int y, int shotX, int shotY) {
			 this.x = x;
			 this.y = y;
			 this.shotX = shotX;
			 this.shotY = shotY;
		 }
	
}
