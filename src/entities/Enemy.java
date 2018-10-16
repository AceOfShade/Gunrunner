package entities;

public class Enemy extends GameObject{
<<<<<<< HEAD
	int health;
=======
	public int x, y, health;
>>>>>>> master
	
	public Enemy(int x, int y, int health) {
		super(x, y, 100, 140);
		this.health = health;
	}
<<<<<<< HEAD
=======
	
>>>>>>> master
	public Enemy(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
	}
}
