package main;


import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import entities.Shot;
import rendering.Label;

public class Variables {

    //Screen width and hight
	public static int screenwidth = 800;
	public static int screenhight = 600;
	public static int backgroundY1 = 0;
	public static int x=400,y=400;

	
	public static int speedshot=30;
	public static double speedX=5,speedjump=3,speeddown=4.5;
	//Move
	public static boolean moveup, shot, moveleft,lookleft, moveright, movedown;
	//kein plan also label
	public static boolean startmenu = true;
	public static boolean loadscreen;
	//Bilder
	public static BufferedImage l1,l2,loading,start,player1,player1inv,e,bullet,bulletinv,enemy,icon,kill,hp;
	//frag fabian
	public static byte level;
	public static boolean debug;
	public static Shot[] shots;
	public static int freePos;
	public static int maxShots =100  ;	//100 max shots per frame 
	public static boolean f2;			//Playerwechsel
	
	// Constructor
	public Variables() {
		shots = new Shot[maxShots];
		
		
		
	}	
}