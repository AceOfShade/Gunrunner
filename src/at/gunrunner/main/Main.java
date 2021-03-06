package at.gunrunner.main;
 

import at.gunrunner.inputs.*;
import at.gunrunner.rendering.*;
import at.gunrunner.sound.WeaponSoundhandler;

public class Main {
	
	public static final String VERSIONID = "Alpha 1.01.02.06.04";
	
	public static Game g;
	public static KeyHandler kh;
	public static Frame f;
	public static Label lbl;
	public static GameWorld gw;
	public static Collision c;
	public static Resources res;
	public static WeaponSoundhandler s;

	public static void main(String[] args) {
		res = new Resources();
		s = new WeaponSoundhandler();
		lbl = new Label();
		g = new Game();
		kh = new KeyHandler();
		f =new Frame();
		gw= new GameWorld();
		start();
	}
	
	public static void start() {
		g.startGame();
	}
}
