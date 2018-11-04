package entities;

public class Enemy extends GameObject {
	int x, y, health;
	public static boolean bodycollision;
	public static boolean enemykill;
	public Enemy(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
	}

	public Enemy(int x, int y, int health) {
		super(x, y, 100, 140);
		this.health = health;
	}

	@Override
	public void render() {
<<<<<<< HEAD
		
		
=======
		// TODO Auto-generated method stub
		if(bodycollision) {
			health--;
			Enemy.bodycollision=false;
		if(health==0) {
			enemykill=true;
		}
		}
>>>>>>> master
	}
}