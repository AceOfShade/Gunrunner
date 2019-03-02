package at.gunrunner.abilitys;

import at.gunrunner.entities.Player;
import at.gunrunner.entities.Shot;
import at.gunrunner.main.Main;

public class Weapon {

	public static String name;
	public static int shotXstart = 0, shotYstart = 0;
	public static int cooldowntime = 0; // in millisekunden
	private int cooldown;
	public static float speedshot = 0;
	 
	public void waffe(String name) {
		Weapon.name = name;
		if(Player.lookingLeft){
			switch(name) {
			case"MP7" : set(26,75,200, 1.25f);break;
			case"Pistole" : set(3,43,600, 1f);break;
			}
		}else {
			switch(name) {
			case"MP7" : set(75,85,200, 1.25f);break;
			case"Pistole" : set(97,43,600, 1f);break;
			}
		}
		cooldown = cooldowntime;
	}
	
		 public void set(int shotXstart, int shotYstart, int cooldowntime, float speedshot) {
			 Weapon.shotXstart = shotXstart;
			 Weapon.shotYstart = shotYstart;
			 Weapon.cooldowntime = cooldowntime;
			 Weapon.speedshot = speedshot;
		 }

		public void shoot(boolean shoot) {
			if(shoot && cooldown == cooldowntime) {
				Main.gw.shotObjects.add(new Shot());
				cooldown = 0;
				return;
			}
			if(cooldown < cooldowntime){
				cooldown++;
			}
		}
}
