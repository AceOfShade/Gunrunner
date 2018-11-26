package entities;

public class Player extends GameObject {
	public int kills = 0; // kills from player
	public int health; // player health
	int velY;

	public Player(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
		velY = 0;
	}
	
	public Player(int x, int y, byte health) {
		super(x, y, 140, 100);
		this.health = health;
	}

	public void render() {
		
		
	}
}
