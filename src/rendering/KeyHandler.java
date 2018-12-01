package rendering;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Variables;

public class KeyHandler implements KeyListener {
	public static char lastPressed;
	public static boolean kPressed, wPressed, aPressed, dPressed, spacePressed, f2Pressed, f1Pressed, escPressed;
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = true;
		}
//		if (e.getKeyCode() == KeyEvent.VK_W) {
//			lastPressed = 'w';
//		}
//
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = true;
		}
//		if (e.getKeyCode() == KeyEvent.VK_A) {
//			lastPressed = 'a';
//		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dPressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			if (Variables.startmenu) {
				Variables.startmenu = false;
			} else {
				KeyHandler.spacePressed = true;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_F1){
			f1Pressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_F2) {
			f2Pressed = !f2Pressed;
		}
		if(e.getKeyCode()== KeyEvent.VK_K) {
			kPressed=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			spacePressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dPressed = false;
		}
		if(e.getKeyCode()== KeyEvent.VK_ESCAPE) {
			escPressed=false;
		}
		if(e.getKeyCode()== KeyEvent.VK_K) {
			kPressed=false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
