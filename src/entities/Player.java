package entities;

public class Player extends GameObject {
	public static int x;
	public static int y;
	public static int phight=100;			//Player hight
	public static int pwidth=140;			//Player width
	public static int kills=0;				//kills from player
	public static int health=3;			//player health

	public Player(int x, int y) {
		super(x, y, 140, 100);
		Player.x = x;
		Player.y = y;
	}
}
