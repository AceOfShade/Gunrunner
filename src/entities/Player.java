package entities;

public class Player extends GameObject{
	public int kills = 0;			//kills from player
	public int health = 3;			//player health
	public float velY;
	public int jumpheight = 70;
	
	public Player(int x, int y) {
		super(x, y,140, 100);
		
	}
}