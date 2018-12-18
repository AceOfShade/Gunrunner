 package main;

import sound.*;
import entities.*;
import inputs.KeyHandler;
import rendering.*;

public class Main {
	public static boolean gamestart;
	public static boolean loadscreen;
	
	public static Game g;
	public static KeyHandler kh;
	public static Gui gui;
	public static Variables v;
	public static Label lbl;
	public static Sound s;
	public static GameWorld lvl;
	public static Movement mov;
	public static Collision c;
	
	

	public static void main(String[] args) {
		v = new Variables();
		lbl = new Label();
		g = new Game();
		kh = new KeyHandler();
		gui =new Gui();
		s = new Sound();
		lvl= new GameWorld();
		mov= new Movement();
		g.startGame();
		
	}
}
