package main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import rendering.Label;

public class Variables {

	public static JFrame jf1;
	// Screen width and hight
	public static int screenwidth = 800;
	public static int screenhight = 600;
	public static int backgroundY1 = 0;
	public static int x = 400, y = 400;
	// Enemy
	public static int eheight = 100; // Enemy hight
	public static int ewidth = 140; // Enemy width

	public static int speedshot = 30;
	public static double speedright = 5;
	public static double speedleft = 5;
	public static double speedjump = 3;
	public static double speeddown = 4.5;
	
	// kein plan also label
	public static Label lbl;
	public static boolean lefting = false, righting = false;
	public static boolean startmenu = true;
	// Schuss X und Y
	public static int sy;
	public static int sx;
	// Bilder
	public static BufferedImage l1, l2, l3, loading, start, player1, player1inv, e, bullet, bulletinv, enemy,enemydead, icon, kill,
			hp;
	// frag fabian
	public static int jumpheight = 70;
	public static int maxShots = 100; // 100 max shots per frame
	public static boolean f2; // Playerwechsel

	// Constructor
	public Variables() {

		try {
			l2 = ImageIO.read(Variables.class.getResourceAsStream("/level2.png"));
			l1 = ImageIO.read(Variables.class.getResourceAsStream("/level1.png"));
			l3 = ImageIO.read(Variables.class.getResourceAsStream("/level3.png"));
			start = ImageIO.read(Variables.class.getResourceAsStream("/start.png"));
			icon = ImageIO.read(Variables.class.getResourceAsStream("/iconi.png"));
			bullet = ImageIO.read(Variables.class.getResourceAsStream("/patrone.png"));
			bulletinv = ImageIO.read(Variables.class.getResourceAsStream("/patroneInv.png"));
			enemy = ImageIO.read(Variables.class.getResourceAsStream("/gegner1.png"));
			enemydead= ImageIO.read(Variables.class.getResourceAsStream("/deadenemy.png"));
			player1 = ImageIO.read(Variables.class.getResourceAsStream("/playermodel.png"));
			player1inv = ImageIO.read(Variables.class.getResourceAsStream("/player3inv.png"));
			e = ImageIO.read(Variables.class.getResourceAsStream("/player3.png"));
			hp = ImageIO.read(Variables.class.getResourceAsStream("/Hp.png"));
			kill = ImageIO.read(Variables.class.getResourceAsStream("/Kills.png"));
			loading = ImageIO.read(Variables.class.getResourceAsStream("/loadingscreen.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}
}