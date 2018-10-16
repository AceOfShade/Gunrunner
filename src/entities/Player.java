package entities;

public class Player extends GameObject{
	public static int px=350;
	public static int py=400;
	public int phight=100;			//Player hight
	public int pwidth=140;			//Player width
	public int kills=0;				//kills from player
	public int health=3;			//player health

	public Player(int x, int y) {
		super(x, y,140, 100);
		
	}
}
