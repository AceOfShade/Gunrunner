package at.gunrunner.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import at.gunrunner.entities.Player;
import at.gunrunner.rendering.Label;
import at.gunrunner.main.*;

public class KeyHandler implements KeyListener {
	public static char lastPressed;
	public static boolean kPressed, wPressed, aPressed, dPressed, spacePressed, f2Pressed, f1Pressed, escPressed;
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = true;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = true;
			Player.lookingLeft = true;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dPressed = true;
			Player.lookingLeft = false;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			if (Label.startmenu) {
				Label.startmenu = false;
			}else{
				KeyHandler.spacePressed = true;
			}
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_F1){
			f1Pressed = true;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_F2) {
			f2Pressed = !f2Pressed;
			return;
		}
		if(e.getKeyCode()== KeyEvent.VK_K) {
			kPressed=true;
			Main.gw.player.kills++;
			return;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = false;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			spacePressed = false;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = false;
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dPressed = false;
			return;
		}
		if(e.getKeyCode()== KeyEvent.VK_ESCAPE) {
			escPressed=false;
			return;
		}
		if(e.getKeyCode()== KeyEvent.VK_K) {
			kPressed=false;
			return;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
