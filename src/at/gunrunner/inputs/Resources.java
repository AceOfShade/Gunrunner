package at.gunrunner.inputs;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import at.gunrunner.sound.WeaponSoundhandler;

public class Resources {
	public static BufferedImage l1, l2, l3, loading, start, player1, player1inv,playerwp ,playerwpinv, e, bullet, bulletinv, enemy,enemydead, icon, kill,
	hp;
	 //noch verbessern!
	
	public Resources() {
		try {
			
			l2 = ImageIO.read(Resources.class.getResourceAsStream("/gfx/level2.png"));
			l1 = ImageIO.read(Resources.class.getResourceAsStream("/gfx/level1.png"));
			l3 = ImageIO.read(Resources.class.getResourceAsStream("/gfx/level3.png"));
			start = ImageIO.read(Resources.class.getResourceAsStream("/gfx/start.png"));
			icon = ImageIO.read(Resources.class.getResourceAsStream("/gfx/iconi.png"));
			bullet = ImageIO.read(Resources.class.getResourceAsStream("/gfx/patrone.png"));
			bulletinv = ImageIO.read(Resources.class.getResourceAsStream("/gfx/patroneInv.png"));
			enemy = ImageIO.read(Resources.class.getResourceAsStream("/gfx/gegner1.png"));
			enemydead= ImageIO.read(Resources.class.getResourceAsStream("/gfx/deadenemy.png"));
			player1 = ImageIO.read(Resources.class.getResourceAsStream("/gfx/playermodel.png"));
			player1inv = ImageIO.read(Resources.class.getResourceAsStream("/gfx/player3inv.png"));
			playerwp = ImageIO.read(Resources.class.getResourceAsStream("/gfx/playerwp.png"));
			playerwpinv = ImageIO.read(Resources.class.getResourceAsStream("/gfx/playerwpinv.png"));
			e = ImageIO.read(Resources.class.getResourceAsStream("/gfx/player3.png"));
			hp = ImageIO.read(Resources.class.getResourceAsStream("/gfx/Hp.png"));
			kill = ImageIO.read(Resources.class.getResourceAsStream("/gfx/Kills.png"));
			loading = ImageIO.read(Resources.class.getResourceAsStream("/gfx/loadingscreen.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}
}
