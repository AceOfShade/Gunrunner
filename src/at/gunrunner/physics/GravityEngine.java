package at.gunrunner.physics;

import java.util.ArrayList;

import at.gunrunner.entities.GameObject;

public class GravityEngine {
	boolean gravity;
	float gravitySpeed;
	
	public void gravity(ArrayList<GameObject> a) {
		for(GameObject g : a) {
			if(g.y >= 600) {
				g.y = 600;
			}else {
				
			}
		}
	}
}
