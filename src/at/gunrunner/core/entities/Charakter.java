package at.gunrunner.core.entities;

public abstract class Charakter extends PhysicsObject {

	public Charakter(float x, float y, int w, int h) {
		super(x, y, w, h);
	}
	
	public void jump(float jumpHeight) {
		if(y >= 400) {
			setVelY(jumpHeight);
		}
	}
}
