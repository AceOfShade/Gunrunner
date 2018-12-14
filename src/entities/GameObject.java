package entities;

/**
 *
 * This is an Abstract Game object class used as a base for further implementations 
 */
public class GameObject {	public float x, y;
public int w, h;

	public GameObject(float f, float g, int w, int h) {
		super();
		this.x = f;
		this.y = g;
		this.w = w;
		this.h = h;
	}
	
//	public abstract void render();

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}
	

}