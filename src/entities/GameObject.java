package entities;

/**
 *
 * This is an Abstract Game object class used as a base for further implementations 
 */
public class GameObject {
	public int x, y, w, h;

	public GameObject(int x, int y, int w, int h) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
//	public abstract void render();

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}
	

}