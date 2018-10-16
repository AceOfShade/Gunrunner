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
public class Label extends JLabel{
	private static final long serialVersionUID = 1L;
	
	public void Iconsetzen(){Variables.jf1.setIconImage(Variables.icon);}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(!Variables.startmenu) {
			if(!Variables.loadscreen) {
				g.drawImage(Variables.loading, Variables.backgroundY1, 1, 800, 600, null);	
			}
				g.drawImage(Variables.l1, 0, Variables.backgroundY1, 800, 600, null);	
				g.drawImage(Variables.enemy,575, 400, 100, 140, null);
				
				//different Playermodels
				if(Variables.f2) {
					g.drawImage(Variables.player1, Main.lvl.p.x, Main.lvl.p.y, 100, 140, null);	
				}else if(Variables.moveleft){
					g.drawImage(Variables.player1inv,Main.lvl.p.x, Main.lvl.p.y ,100,140,null);
				}else {
					g.drawImage(Variables.e, Main.lvl.p.x, Main.lvl.p.y, 100, 140, null);
				}
				
				g.drawString("Health: " + Main.lvl.p.health, 20, 40);
				g.drawString("Kills: " + Main.lvl.p.kills, 20, 20);
				
				
				//painting all Bullets
				for(int i = 0; i < Variables.freePos;i++) {
					if(Variables.shots[i].sX != Main.lvl.p.x+75) {
						g.drawImage(Variables.bullet, Variables.shots[i].sX, Variables.shots[i].sY, 9,9, null);
						if(Variables.moveleft) {	
						g.drawImage(Variables.bulletinv, Variables.shots[i].sX, Variables.shots[i].sY, 9, 9, null);
						}
					}
				}
		}else {
			g.drawImage(Variables.start, 0, Variables.backgroundY1, 800, 600, null);
		}
		repaint();
	}
}