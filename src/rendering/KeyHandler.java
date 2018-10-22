package rendering;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;
import main.Variables;

public class KeyHandler implements KeyListener {
	public static boolean wPressed, aPressed, dPressed, spacePressed, f2Pressed, f1Pressed;

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = true;
		}
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
			if (f2Pressed) {
				aPressed = true;
			} else {
				f2Pressed = true;
			}
		}
		switch(e.getKeyCode()) {
		case KeyEvent.VK_F1: break;
		case KeyEvent.VK_F2: break;
		case KeyEvent.VK_F3: break;
		case KeyEvent.VK_F4: break;
		case KeyEvent.VK_F5: break;
		case KeyEvent.VK_F6: break;
		case KeyEvent.VK_F7: break;
		case KeyEvent.VK_F8: break;
		case KeyEvent.VK_F9: break;
		case KeyEvent.VK_F10: break;
		case KeyEvent.VK_F11: break;
		case KeyEvent.VK_F12: break;
		case KeyEvent.VK_Q: break;
		case KeyEvent.VK_W: break;
		case KeyEvent.VK_E: break;
		case KeyEvent.VK_R: break;
		case KeyEvent.VK_T: break;
		case KeyEvent.VK_Z: break;
		case KeyEvent.VK_U: break;
		case KeyEvent.VK_I: break;
		case KeyEvent.VK_O: break;
		case KeyEvent.VK_P: break;
		case KeyEvent.VK_A: break;
		case KeyEvent.VK_S: break;
		case KeyEvent.VK_D: break;
		case KeyEvent.VK_F: break;
		case KeyEvent.VK_G: break;
		case KeyEvent.VK_H: break;
		case KeyEvent.VK_J: break;
		case KeyEvent.VK_K: break;
		case KeyEvent.VK_L: break;
		case KeyEvent.VK_Y: break;
		case KeyEvent.VK_X: break;
		case KeyEvent.VK_C: break;
		case KeyEvent.VK_V: break;
		case KeyEvent.VK_B: break;
		case KeyEvent.VK_N: break;
		case KeyEvent.VK_M: break;
		case KeyEvent.VK_SPACE: break;
		case KeyEvent.VK_SHIFT: break;
		
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
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
