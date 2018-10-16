  package main;

import sound.Sound;
import rendering.Gui;
import rendering.KeyHandler;
import rendering.Label;

public class Main {
	static Game g;
	static KeyHandler kh;
	static Gui gu;
	static Variables v;
	static Label l;
	static Sound s;
	
	
	public static void main(String[] args) {
		g = new Game();
		kh = new KeyHandler();
		gu =new Gui();
		v = new Variables();
		l = new Label();
		s = new Sound();
		l.Iconsetzen();
		
	}
}
