package Engin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

@SuppressWarnings("unused")
public class Label extends JLabel{
	private static final long serialVersionUID = 1L;
	
	public void Iconsetzen(){Variables.jf1.setIconImage(Variables.icon);}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g.drawImage(Variables.b1, 0, Variables.backgroundY1, 800, 600, null);	
		g.drawImage(Variables.enemy,Variables.ex, Variables.ey, 100, 140, null);
		
		if(Variables.moveleft==true) {
			g.drawImage(Variables.player1inv,Variables.px, Variables.py ,100,140,null);
			
		}
		else {
		//verschiedene Player
		if(Variables.f2) {
			g.drawImage(Variables.player1, Variables.px, Variables.py, 100, 140, null);	
		}else {
			g.drawImage(Variables.e, Variables.px, Variables.py, 100, 140, null);	
		}
		}
		//alle Bullets painten
		for(int i = 0; i < Variables.freiePos;i++) {
			if(Variables.shots[i].sX != Variables.px+75) {
				g.drawImage(Variables.bullet, Variables.shots[i].sX, Variables.shots[i].sY, 9,9, null);
				if(Variables.moveleft) {
					g.drawImage(Variables.bulletinv, Variables.shots[i].sX, Variables.shots[i].sY, 9, 9, null);
				}
			}
		}
		repaint(); 	
	}
}
		
 


