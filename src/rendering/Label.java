package rendering;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

import entities.Player;
import main.Main;
import main.Variables;

@SuppressWarnings("unused")
public class Label extends JLabel{
	private static final long serialVersionUID = 1L;
	
	public Label() {
		setBounds(0,0,Variables.screenwidth,Variables.screenhight);
		setVisible(true);
		
		try {

			Variables.l1 = ImageIO.read(Variables.class.getResourceAsStream("/level1.png"));
			Variables.start = ImageIO.read(Variables.class.getResourceAsStream("/start.png"));
			Variables.icon = ImageIO.read(Variables.class.getResourceAsStream("/iconi.png"));
			Variables.bullet = ImageIO.read(Variables.class.getResourceAsStream("/patrone.png"));
			Variables.bulletinv=ImageIO.read(Variables.class.getResourceAsStream("/patroneinv.png"));
			Variables.enemy=ImageIO.read(Variables.class.getResourceAsStream("/gegner1.png"));
			Variables.player1 = ImageIO.read(Variables.class.getResourceAsStream("/playermodel.png"));
			Variables.player1inv = ImageIO.read(Variables.class.getResourceAsStream("/player3inv.png"));
			Variables.e = ImageIO.read(Variables.class.getResourceAsStream("/player3.png"));
			Variables.hp = ImageIO.read(Variables.class.getResourceAsStream("/Hp.png"));
			Variables.kill = ImageIO.read(Variables.class.getResourceAsStream("/Kills.png"));
			Variables.loading = ImageIO.read(Variables.class.getResourceAsStream("/loadingscreen.png"));
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't load images");
		}
	}
	
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