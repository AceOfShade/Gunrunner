package abilitys;


public class Weapon {

	 public static int shotX = 0, shotY = 0;
	 
	public void waffe(String name) {
		switch(name) {
		case"MP7" : set(0,0,75,85);break;
		case"Pistole" : set(0,0,97,43);break;
		}
	}
		 
		 public void set(int x, int y, int shotX, int shotY) {
//			 this.x = x;
//			 this.y = y;
			 Weapon.shotX = shotX;
			 Weapon.shotY = shotY;
		 }
		 
		 public void direction() {
				 shotX *= -1;
		 }
	
}
