package entities;

public class Player extends GameObject {
	public int kills = 0; // kills from player
	public int health; // player health

	public Player(int x, int y) {
		super(x, y, 140, 100);
		this.health = 3;
	}
	
	public Player(int x, int y, int health) {
		super(x, y, 140, 100);
		this.health = health;
	}

	@Override
	public void render() {
		
		
	}
}
