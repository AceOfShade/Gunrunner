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
	static int phight=100;			//Player hight
	static int pwidth=140;			//Player width
	static int kills=0;				//kills from player
	static int health=3;			//player health
	
	//Enemy
	static int ex=675,ey=400;
	static int ehight=100;			//Enemy hight
	static int ewidth=140;			//Enemy width
	static ArrayList<Sprite> enemySprites;
	
	
	
	static int speedshot=30;
	static boolean collision=false;
	static double speedright=5,speedleft=5,speedjump=3,speeddown=4.5;
	//Move
	static boolean moveup = false, shot= false, moveleft = false, moveright = false, movedown=false;
	//kein plan also label
	static Label lbl;
	static boolean lefting=false, righting=false;
	//Schuss X und Y
	static int sy;
	static int sx;
	//Bilder
	static BufferedImage b1,start,player1,player1inv,e,bullet,bulletinv,enemy,icon;
	//frag fabian
	static byte level;
	static float velY;
	static int jumpheight = 70;
	static boolean debug = false;
	static Shot[] shots;
	static int freePos = 0;
	static int maxShots =100  ;//100 max shots per frame 
	static boolean f2;//Playerwechsel
	static Enemy[] enemys;
	
	// Constructor
	public Variables() {
		shots = new Shot[maxShots];
		
		try {

			b1 = ImageIO.read(Variables.class.getResourceAsStream("/back.png"));
			start = ImageIO.read(Variables.class.getResourceAsStream("/start.png"));
			icon = ImageIO.read(Variables.class.getResourceAsStream("/iconi.png"));
			bullet = ImageIO.read(Variables.class.getResourceAsStream("/patrone.png"));
			bulletinv=ImageIO.read(Variables.class.getResourceAsStream("/patroneinv.png"));
			enemy=ImageIO.read(Variables.class.getResourceAsStream("/gegner1.png"));
			player1 = ImageIO.read(Variables.class.getResourceAsStream("/playermodel.png"));
			player1inv = ImageIO.read(Variables.class.getResourceAsStream("/player3inv.png"));
			e = ImageIO.read(Variables.class.getResourceAsStream("/player3.png"));
			

		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}			
}