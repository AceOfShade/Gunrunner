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
	public int pic;
	public boolean nextPic;
	
	public Label() {
		pic= 1;
	}
	
	public void Iconsetzen() {
		Variables.jf1.setIconImage(Variables.icon);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (Main.lvl.player.getX() + Main.lvl.player.getW() >= 800 && pic < 2 && pic >=0) {
			pic++;
			Main.lvl.player.x = 10;
		}else if (Main.lvl.player.getX() <= 5 && pic <= 2 && pic >1) {
			pic--;
			Main.lvl.player.x = 790 - Main.lvl.player.getW();
		}
		
		if (!Variables.startmenu) {//Wenn du möchtest das etwas wartet, dann verwende Thread.sleep(millis)
//			if (!Variables.loadscreen) {
//				g.drawImage(Variables.loading, Variables.backgroundY1, 1, 800, 600, null);
//			}
			switch(pic) {
			case 1:		g.drawImage(Variables.l1, 0, 0, 800, 600, null);break;
			
			case 2:		
				g.drawImage(Variables.l2, 0, 0, 800, 600, null);;break;
			
			default:g.drawImage(Variables.l2, 0, 0, 800, 600, null);;break;
			}
			
			for(int i = 0; i < Main.lvl.enemyObjects.size(); i++) {
				g.drawImage(Variables.enemy, Main.lvl.enemyObjects.get(i).getX(), Variables.ey, 100, 140, null);
			}
			

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
			for (int i = 0; i < Main.lvl.shotObjects.size(); i++) {
				if (Main.lvl.shotObjects.get(i).getX() != Main.lvl.player.x + 75) {
					g.drawImage(Variables.bullet, Main.lvl.shotObjects.get(i).getX(), Main.lvl.shotObjects.get(i).getY(), 9, 9, null);
					if (Variables.moveleft) {
						g.drawImage(Variables.bulletinv, Main.lvl.shotObjects.get(i).getX(), Main.lvl.shotObjects.get(i).getY(), 9, 9, null);
					}
				}
			}
		} else {
			g.drawImage(Variables.start, 0, Variables.backgroundY1, 800, 600, null);
		}
		repaint();
	}
}