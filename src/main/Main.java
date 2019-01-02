 package main;

import entities.*;
import inputs.*;
import rendering.*;

public class Main {
	
	public static Game g;
	public static KeyHandler kh;
	public static Frame f;
	public static Variables v;
	public static Label lbl;
	public static GameWorld gw;
	public static Movement mov;
	public static Collision c;
	
	

	public static void main(String[] args) {
		v = new Variables();
		lbl = new Label();
		g = new Game();
		kh = new KeyHandler();
		f =new Frame();
		gw= new GameWorld();
		mov= new Movement();
		g.startGame();
		
	}
}
