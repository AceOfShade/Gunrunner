package main;


import java.awt.image.BufferedImage;
<<<<<<< HEAD
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import entities.Enemy;
import entities.Shot;
import rendering.Label;

public class Variables {

	public static JFrame jf1;
=======
import entities.Shot;

public class Variables {

>>>>>>> master
    //Screen width and hight
	public static int screenwidth = 800;
	public static int screenhight = 600;
	public static int backgroundY1 = 0;
	public static int x=400,y=400;

	
<<<<<<< HEAD
	//Player

	public static int px=350,py=400; 
	public static int pheight;			//Player hight
	public static int pwidth;			//Player width
	public static int kills=0;						//kills from player
	public static int health=3;					//player health
	

	//Sound
	public static boolean sound=false;
	//Enemy
	public static int ex=675,ey=400;
	public static int eheight=100;					//Enemy hight
	public static int ewidth=140;					//Enemy width
	
	
	
	
	public static int speedshot=30;
	public static boolean collision=false;
	public static double speedright=5,speedleft=5,speedjump=3,speeddown=4.5;
	//Move
	public static boolean moveup = false, shot= false, moveleft = false, moveright = false, movedown=false;
	//kein plan also label
	public static boolean lefting=false, righting=false;
	public static boolean startmenu = true;
	public static boolean loadscreen = false;
	//Schuss X und Y
	public static int sy;
	public static int sx;
=======
	public static int speedshot=30;
	public static double speedX=5,speedjump=3,speeddown=4.5;
	//Move
	public static boolean moveup, shot, moveleft,lookleft, moveright, movedown;
	//kein plan also label
	public static boolean startmenu = true;
	public static boolean loadscreen;
>>>>>>> master
	//Bilder
	public static BufferedImage l1,l2,loading,start,player1,player1inv,e,bullet,bulletinv,enemy,icon,kill,hp;
	//frag fabian
	public static byte level;
<<<<<<< HEAD
	public static float velY;
	public static int jumpheight = 70;
	public static boolean debug = false;
=======
	public static boolean debug;
>>>>>>> master
	public static Shot[] shots;
	public static int freePos;
	public static int maxShots =100  ;	//100 max shots per frame 
	public static boolean f2;			//Playerwechsel
<<<<<<< HEAD
	public static Enemy[] enemies;
=======
>>>>>>> master
	
	// Constructor
	public Variables() {
		shots = new Shot[maxShots];
<<<<<<< HEAD
		
		
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
=======
>>>>>>> master
	}	
}