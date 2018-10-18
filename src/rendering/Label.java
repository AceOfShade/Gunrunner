package rendering;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

import entities.Player;
import main.Main;
import main.Variables;

@SuppressWarnings("unused")
public class Label extends JLabel {
	private static final long serialVersionUID = 1L;
	public static byte pic;
	public boolean nextPic;
	
	public void Iconsetzen() {
		Variables.jf1.setIconImage(Variables.icon);
		pic = 1;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		
		if (!Variables.startmenu) {
//			if (!Variables.loadscreen) {
//				g.drawImage(Variables.loading, Variables.backgroundY1, 1, 800, 600, null);
//			}
			if(nextPic) {pic++; nextPic = false;}
//			switch(pic) {
//			case 1:		g.drawImage(Variables.l1, 0, Variables.backgroundY1, 800, 600, null); System.out.println("a");break;
//			case 2:		g.drawImage(Variables.l2, 0, Variables.backgroundY1, 800, 600, null);System.out.println("b");break;
//			}
			if(pic == 1) {
				g.drawImage(Variables.l1, 0, Variables.backgroundY1, 800, 600, null);
			}else if(pic == 2) {
				g.drawImage(Variables.l2, 0, Variables.backgroundY1, 800, 600, null);
			}
			
			g.drawImage(Variables.enemy, Variables.ex, Variables.ey, 100, 140, null);

			// different Playermodels
			if (Variables.f2) {
				g.drawImage(Variables.player1, Main.lvl.player.x, Main.lvl.player.y, 100, 140, null);
			} else if (Variables.moveleft) {
				g.drawImage(Variables.player1inv, Main.lvl.player.x, Main.lvl.player.y, 100, 140, null);
			} else {
				g.drawImage(Variables.e, Main.lvl.player.x, Main.lvl.player.y, 100, 140, null);
			}

			g.drawString("Health: " + Main.lvl.player.health, 20, 40);
			g.drawString("Kills: " + Main.lvl.player.kills, 20, 20);

			// painting all Bullets
			for (int i = 0; i < Variables.freePos; i++) {
				if (Variables.shots[i].sX != Main.lvl.player.x + 75) {
					g.drawImage(Variables.bullet, Variables.shots[i].sX, Variables.shots[i].sY, 9, 9, null);
					if (Variables.moveleft) {
						g.drawImage(Variables.bulletinv, Variables.shots[i].sX, Variables.shots[i].sY, 9, 9, null);
					}
				}
			}
		} else {
			g.drawImage(Variables.start, 0, Variables.backgroundY1, 800, 600, null);
		}
		repaint();
	}
}