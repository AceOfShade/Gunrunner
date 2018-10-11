package Engin;


import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

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
	
	//Enemy
	static int ex=675,ey=400;
	static int ehight=100;			//Enemy hight
	static int ewidth=140;			//Enemy width
	
	
	static int speedshot=20;
<<<<<<< HEAD
	static boolean kollision=false;
	static double speedright=500,speedleft=500,speedjump=3000,speeddown=40.5;
=======
	static boolean collision=false;
	static double speedright=5,speedleft=5,speedjump=3,speeddown=4.5;
>>>>>>> b37497078362587ba95aabaf1cc01d1ba655e791
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
			b1 = ImageIO.read(new File("rsc/back.png"));//background
			start= ImageIO.read(new File("rsc/start.png"));//start
			icon=ImageIO.read(new File("rsc/iconi.png"));//Icon Image
			bullet=ImageIO.read(new File("rsc/patrone.png"));//shot
			bulletinv=ImageIO.read(new File("rsc/patroneinv.png"));//Shot(inv.)
			enemy=ImageIO.read(new File("rsc/gegner1.png"));//Enemy
			player1 = ImageIO.read(new File("rsc/playermodel.png"));//Player(normal)
			player1inv = ImageIO.read(new File("rsc/player3inv.png"));//Player(inv.)
			e = ImageIO.read(new File("rsc/player3.png"));//Player(Easteregg)
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}			
}