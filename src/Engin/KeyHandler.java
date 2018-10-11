package Engin;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	Player p = new Player();

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
				p.jump();
			}
			
		if (e.getKeyCode() == KeyEvent.VK_A) {
			p.moveLeft();
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {	
			p.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {		
			Variables.shot = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_F1) { 
			Variables.debug =true;
			}
		if (e.getKeyCode() == KeyEvent.VK_F2) {
			if(Variables.f2) {Variables.f2 = false;}
			else {Variables.f2 = true;}
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
