package abilitys;

import entities.Player;

public class Weapon {

	public static String name; 
	public static int shotX = 0, shotY = 0;
	public static int cooldown = 0; // in millisekunden
	 
	public void waffe(String name) {
		Weapon.name = name;
		if(Player.lookingLeft){
			switch(name) {
			case"MP7" : set(26,75,200);break;
			case"Pistole" : set(3,43,600 );break;
			}
		}else {
			switch(name) {
			case"MP7" : set(75,85,200);break;
			case"Pistole" : set(97,43,600);break;
			}
		}
	}
		 
		 public void set(int shotX, int shotY, int cooldown) {
			 Weapon.shotX = shotX;
			 Weapon.shotY = shotY;
			 Weapon.cooldown = cooldown;
		 }
}
