package rendering;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

import main.Main;
import main.Variables;


public class Label extends JLabel {
	private static final long serialVersionUID = 1L;
	public int pic;
	public boolean loadscreen;
	public int loadingscreentimer;
	
	public Label() {
		pic= 1;
		loadscreen = false;
		loadingscreentimer = 200;
	}
	
	public void Iconsetzen() {
		Variables.jf1.setIconImage(Variables.icon);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(pic==1 && Main.lvl.player.kills >=5) {
			
			//After 5 Kills
			if (Main.lvl.player.getX() + Main.lvl.player.getW() >= 800 && pic < 3 && pic >=0) {
				pic++;
				Main.lvl.player.x = 10;
			}
//			else if (Main.lvl.player.getX() <= 5 && pic <= 2 && pic >1) {
//				pic--;
//				Main.lvl.player.x = 790 - Main.lvl.player.getW();
//			}
			
		}
		//after 10 kills
		if(pic==2 && Main.lvl.player.kills >=10) {
			
			if (Main.lvl.player.getX() + Main.lvl.player.getW() >= 800 && pic < 3 && pic >=0) {
				pic++;
				Main.lvl.player.x = 10;
			}
//			else if (Main.lvl.player.getX() <= 5 && pic <= 3 && pic >1) {
//				pic--;
//				Main.lvl.player.x = 790 - Main.lvl.player.getW();
//			}
		}
		
		
		if (!Variables.startmenu) {
			if (!loadscreen && loadingscreentimer < 1) {
				g.drawImage(Variables.loading, Variables.backgroundY1, 1, 800, 600, null);
				KeyHandler.wPressed = true;
			}else {
				switch(pic) {//Levelupdater/changer
				case 1:	g.drawImage(Variables.l1, 0, 0, 800, 600, null);break;
				
				case 2:		
					  g.drawImage(Variables.l2, 0, 0, 800, 600, null);break;
				case 3:
					g.drawImage(Variables.l3, 0, 0, 800, 600, null); break;
					
				default:g.drawImage(Variables.loading, 0, 0, 800, 600, null);break;
				}
				
				for(int i = 0; i < Main.lvl.enemyObjects.size(); i++) {
					g.drawImage(Variables.enemy, (int)(Main.lvl.enemyObjects.get(i).getX()), (int)(Main.lvl.enemyObjects.get(i).getY()), Main.lvl.enemyObjects.get(i).getW(), Main.lvl.enemyObjects.get(i).getH(), null);
				}
				
	
				// different Playermodels
				if (Variables.f2) {
					g.drawImage(Variables.player1, (int)(Main.lvl.player.x), (int)(Main.lvl.player.y), 100, 140, null);
				} else if (KeyHandler.aPressed) {
					g.drawImage(Variables.playerwpinv, (int)(Main.lvl.player.x), (int)(Main.lvl.player.y), 100, 140, null);
				} else {
					g.drawImage(Variables.playerwp, (int)(Main.lvl.player.x), (int)(Main.lvl.player.y), 100, 140, null);
				}
				g.setColor(Color.RED);
				g.drawString("Health: " + Main.lvl.player.health, 20, 40);
				g.drawString("Kills: " + Main.lvl.player.kills, 20, 20);
	
				// painting all Bullets
				for (int i = 0; i < Main.lvl.shotObjects.size(); i++) {
						if (Main.lvl.shotObjects.get(i).right) {
							g.drawImage(Variables.bullet, (int)(Main.lvl.shotObjects.get(i).getX()), (int)(Main.lvl.shotObjects.get(i).getY()), 9, 9, null);
						}else {
							g.drawImage(Variables.bulletinv, (int)(Main.lvl.shotObjects.get(i).getX()), (int)(Main.lvl.shotObjects.get(i).getY()), 9, 9, null);
						}
				}
			}
			if(KeyHandler.escPressed  ){
				Variables.startmenu =true;
			}
			if(KeyHandler.kPressed) {
				Main.lvl.player.kills++;
			}
			
		} else {
			g.drawImage(Variables.start, 0, Variables.backgroundY1, 800, 600, null);
		}
		repaint();
	}
	
}