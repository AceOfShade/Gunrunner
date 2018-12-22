package entities;


public class Player extends GameObject {
	public int kills = 0; // kills from player
	public int health; // player health
	float velY;
	public static int jumpheight = 250;

	public static float speedright = 0.5f;
	public static float speedleft = 0.5f;
	public static float speedjump = 0.6f;
	public static float speeddown = 0.75f;
	
	public static boolean lookingLeft;
	public String waffe;
	
	public Player(int x, int y) {
		super(x, y, 100, 140);
		this.health = 3;
		this.velY = 0;
		this.waffe ="Pistole";
//		waffe.school.shooting(true);
	}
	
	public Player(int x, int y, byte health,String w) {
		super(x, y, 140, 100);
		this.health = health;
		this.waffe = w;
	}

	public void render() {
		
		
	}
}
