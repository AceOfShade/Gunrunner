package at.gunrunner.physics;

import java.util.ArrayList;

import at.gunrunner.entities.GameObject;
import at.gunrunner.entities.PhysicsObject;

public class GravityEngine {
	
	boolean gravity;
	public static int floor = 400;
	public static float gravitySpeed = 0.001f;
	
	public void gravity(ArrayList<PhysicsObject> a) {
		for(PhysicsObject g : a) {
			g.applyGravity();
		}
	}
}
