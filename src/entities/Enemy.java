package entities;

public class Enemy extends GameObject{
	int health;
	
	public Enemy(int x, int y, int health) {
		super(x, y, 100, 140);
		this.health = health;
	}
	public Enemy(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
	}
}
