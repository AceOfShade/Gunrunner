package at.gunrunner.inputs;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Resources {
	public static BufferedImage l1, l2, l3, loading, start, player1, player1inv,playerwp ,playerwpinv, e, bullet, bulletinv, enemy,enemydead, icon, kill,
	hp;
	
	public Resources() {
		try {
			l2 = ImageIO.read(Resources.class.getResourceAsStream("/level2.png"));
			l1 = ImageIO.read(Resources.class.getResourceAsStream("/level1.png"));
			l3 = ImageIO.read(Resources.class.getResourceAsStream("/level3.png"));
			start = ImageIO.read(Resources.class.getResourceAsStream("/start.png"));
			icon = ImageIO.read(Resources.class.getResourceAsStream("/iconi.png"));
			bullet = ImageIO.read(Resources.class.getResourceAsStream("/patrone.png"));
			bulletinv = ImageIO.read(Resources.class.getResourceAsStream("/patroneInv.png"));
			enemy = ImageIO.read(Resources.class.getResourceAsStream("/gegner1.png"));
			enemydead= ImageIO.read(Resources.class.getResourceAsStream("/deadenemy.png"));
			player1 = ImageIO.read(Resources.class.getResourceAsStream("/playermodel.png"));
			player1inv = ImageIO.read(Resources.class.getResourceAsStream("/player3inv.png"));
			playerwp = ImageIO.read(Resources.class.getResourceAsStream("/playerwp.png"));
			playerwpinv = ImageIO.read(Resources.class.getResourceAsStream("/playerwpinv.png"));
			e = ImageIO.read(Resources.class.getResourceAsStream("/player3.png"));
			hp = ImageIO.read(Resources.class.getResourceAsStream("/Hp.png"));
			kill = ImageIO.read(Resources.class.getResourceAsStream("/Kills.png"));
			loading = ImageIO.read(Resources.class.getResourceAsStream("/loadingscreen.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}
}
