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

	public static float speedshot = 1.2f;
	
	// kein plan also label
	public static Label lbl;
	public static boolean startmenu = true;
	// Schuss X und Y
	// Bilder

	public static BufferedImage l1, l2, l3, loading, start, player1, player1inv,playerwp ,playerwpinv, e, bullet, bulletinv, enemy,enemydead, icon, kill,
			hp;

	// frag fabian

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
			playerwp = ImageIO.read(Variables.class.getResourceAsStream("/playerwp.png"));
			playerwpinv = ImageIO.read(Variables.class.getResourceAsStream("/playerwpinv.png"));
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