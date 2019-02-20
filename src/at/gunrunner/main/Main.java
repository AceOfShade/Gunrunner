package at.gunrunner.main;
 

import at.gunrunner.inputs.*;
import at.gunrunner.physics.Movement;
import at.gunrunner.rendering.*;

public class Main {
	
	public static final String VERSIONID = "Alpha 1.01.00.02.03";
	
	public static Game g;
	public static KeyHandler kh;
	public static Frame f;
	public static Label lbl;
	public static GameWorld gw;
	public static Movement mov;
	public static Collision c;
	public static Resources res;
	
	

	public static void main(String[] args) {
		res = new Resources();
		lbl = new Label();
		g = new Game();
		kh = new KeyHandler();
		f =new Frame();
		gw= new GameWorld();
		mov= new Movement();
		start();
	}
	
	public static void start() {
		g.startGame();
	}
}
