package at.gunrunner.rendering;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import at.gunrunner.inputs.KeyHandler;
import at.gunrunner.inputs.Resources;
import at.gunrunner.main.Main;


public class Label extends JLabel {
	private static final long serialVersionUID = 1L;
	public static int pic;
	public boolean loadscreen;
	public int loadingscreentimer;
	public static boolean startmenu;
	
	public Label() {
		startmenu = true;
		pic= 1;
		loadscreen = false;
		loadingscreentimer = 200;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		

		
		
//		if(pic==1 && Main.gw.player.kills >=5) {
//			
//			//After 5 Kills
//			if (Main.gw.player.getX() + Main.gw.player.getW() >= 800 && pic < 3 && pic >=0) {
//				pic++;
//				Main.gw.player.x = 10;
//			}
//			else if (Main.lvl.player.getX() <= 5 && pic <= 2 && pic >1) {
//				pic--;
//				Main.lvl.player.x = 790 - Main.lvl.player.getW();
//			}
//			
//		}
//		//after 10 kills
//		if(pic==2 && Main.gw.player.kills >=10) {
//			
//			if (Main.gw.player.getX() + Main.gw.player.getW() >= 800 && pic < 3 && pic >=0) {
//				pic++;
//				Main.gw.player.x = 10;
//			}
//			else if (Main.lvl.player.getX() <= 5 && pic <= 3 && pic >1) {
//				pic--;
//				Main.lvl.player.x = 790 - Main.lvl.player.getW();
//			}
//		}
		
		
		if (!startmenu) {
			if (!loadscreen && loadingscreentimer < 1) {
				g.drawImage(Resources.loading, 0, 1, 800, 600, null);
			}else {
				switch(pic) {//Levelupdater/changer
				case 1:	
					g.drawImage(Resources.l1, 0, 0, 800, 600, null);break;
				case 2:		
					g.drawImage(Resources.l2, 0, 0, 800, 600, null);break;
				case 3:
					g.drawImage(Resources.l3, 0, 0, 800, 600, null);break;
				}
				
				//enemy
				for(int i = 0; i < Main.gw.enemyObjects.size(); i++) {
					Main.gw.enemyObjects.get(i).render(g);
				}
				///bullets
				for (int i = 0; i < Main.gw.shotObjects.size() && Main.gw.shotObjects.get(i) != null; i++) {
					Main.gw.shotObjects.get(i).render(g);
				}
				
				//alle Hitmarkers
				for(int i = 0; i < Main.gw.hitmarker.size(); i++) {
					Main.gw.hitmarker.get(i).render(g);
					if(Main.gw.hitmarker.get(i).y > 600) {
						Main.gw.hitmarker.remove(i);
						i--;
					}
				}
				
	
				// different Playermodels
					Main.gw.player.render(g);
				//Ende
				g.setColor(Color.RED);
				g.drawString("Health: " + Main.gw.player.health, 20, 40);
				g.drawString("Kills: " + Main.gw.player.kills, 20, 20);
			}
			if(KeyHandler.escPressed){
				startmenu = !false;
			}
			
		} else {
			g.drawImage(Resources.start, 0, 0, 800, 600, null);
		}
		repaint();
	}
}