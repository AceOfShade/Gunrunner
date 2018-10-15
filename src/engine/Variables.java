package engine;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Variables {

	static JFrame jf1;
    //Screen width and hight
	static int screenwidth = 800, screenhight = 600;
	static int backgroundY1 = 0;
	static int x=400,y=400;
	
	//Player

	static int px=350,py=400; 
	static BufferedImage pheight;			//Player hight
	static BufferedImage pwidth;			//Player width
	static int kills=0;						//kills from player
	static int health=3;					//player health

	static ArrayList<Sprite> playerSprites1;	//Arraylist with all objects from type Sprite
	static ArrayList<Sprite> playerSprites = new ArrayList<Sprite>();	//Arraylist with all objects from type Sprite

	//Sound
	static boolean sound=false;
	//Enemy
	static int ex=675,ey=400;
	static int eheight=100;					//Enemy hight
	static int ewidth=140;					//Enemy width
	static ArrayList<Sprite> enemySprites = new ArrayList<Sprite>();
	
	
	
	static int speedshot=30;
	static boolean collision=false;
	static double speedright=5,speedleft=5,speedjump=3,speeddown=4.5;
	//Move
	static boolean moveup = false, shot= false, moveleft = false, moveright = false, movedown=false;
	//kein plan also label
	static Label lbl;
	static boolean lefting=false, righting=false;
	static boolean startmenu = true;
	//Schuss X und Y
	static int sy;
	static int sx;
	//Bilder
	static BufferedImage l1,l2,loading,start,player1,player1inv,e,bullet,bulletinv,enemy,icon,kill,hp;
	//frag fabian
	static byte level;
	static float velY;
	static int jumpheight = 70;
	static boolean debug = false;
	static Shot[] shots;
	static int freePos = 0;
	static int maxShots =100  ;	//100 max shots per frame 
	static boolean f2;			//Playerwechsel
	static Enemy[] enemies;
	
	// Constructor
	public Variables() {
		shots = new Shot[maxShots];
		
		try {

			l1 = ImageIO.read(Variables.class.getResourceAsStream("/level1.png"));
			start = ImageIO.read(Variables.class.getResourceAsStream("/start.png"));
			icon = ImageIO.read(Variables.class.getResourceAsStream("/iconi.png"));
			bullet = ImageIO.read(Variables.class.getResourceAsStream("/patrone.png"));
			bulletinv=ImageIO.read(Variables.class.getResourceAsStream("/patroneinv.png"));
			enemy=ImageIO.read(Variables.class.getResourceAsStream("/gegner1.png"));
			player1 = ImageIO.read(Variables.class.getResourceAsStream("/playermodel.png"));
			player1inv = ImageIO.read(Variables.class.getResourceAsStream("/player3inv.png"));
			e = ImageIO.read(Variables.class.getResourceAsStream("/player3.png"));
			hp = ImageIO.read(Variables.class.getResourceAsStream("/Hp.png"));
			kill = ImageIO.read(Variables.class.getResourceAsStream("/Kills.png"));
			loading = ImageIO.read(Variables.class.getResourceAsStream("/loadingscreen.png"));
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}	
}