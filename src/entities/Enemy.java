package entities;

public class Enemy extends GameObject{
	public int x, y, health;

	public Enemy(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
	}
}
