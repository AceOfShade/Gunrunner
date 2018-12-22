package abilitys;

import entities.Player;

public class Weapon {

	 public static int shotX = 0, shotY = 0;
	 
	public void waffe(String name) {
		if(Player.lookingLeft){
			switch(name) {
			case"MP7" : set(0,0,26,75);break;
			case"Pistole" : set(0,0,3,43);break;
			}
		}else {
			switch(name) {
			case"MP7" : set(0,0,75,85);break;
			case"Pistole" : set(0,0,97,43);break;
			}
		}
	}
		 
		 public void set(int x, int y, int shotX, int shotY) {
			 Weapon.shotX = shotX;
			 Weapon.shotY = shotY;
		 }
}
