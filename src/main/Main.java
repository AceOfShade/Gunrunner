 package main;

import sound.*;
import entities.*;
import rendering.*;

public class Main {
	public static Game g;
	public static KeyHandler kh;
	public static Gui gui;
	public static Variables v;
	public static Label lbl;
	public static Sound s;
	public static Level lvl;
	public static Movement mov;
	
	
	public static void main(String[] args) {
		g = new Game();
		kh = new KeyHandler();
		gui =new Gui();
		v = new Variables();
		lbl = new Label();
		s = new Sound();
		lvl= new Level();
		mov= new Movement();
		
	}
}
