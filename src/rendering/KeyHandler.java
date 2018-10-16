package rendering;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Variables;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Variables.moveup=true;
			}
			
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Variables.moveleft=true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Variables.moveright=true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			if(Variables.startmenu) {
				Variables.startmenu = false;
			}else {
				Variables.shot = true;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_F1) { 
			Variables.debug =true;
			}
		if (e.getKeyCode() == KeyEvent.VK_F2) {
			if(Variables.f2) {Variables.f2 = false;}
			else {Variables.f2 = true;}
		}
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if(!Variables.startmenu) {Variables.startmenu=true;}
			else {Variables.startmenu=false;}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Variables.moveup = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			Variables.shot=false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Variables.moveleft = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Variables.moveright = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
