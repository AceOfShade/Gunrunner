package at.gunrunner.rendering;

import at.gunrunner.entities.Enemy;
import at.gunrunner.entities.GameObject;
import at.gunrunner.entities.Shot;
import at.gunrunner.main.*;

public class Collision {

	public void testC(){
		Enemy e = null;
		Shot s = null;
		for(int i = 0;i < Main.gw.enemyObjects.size();i++) {
			if(collisionRect(Main.gw.player, Main.gw.enemyObjects.get(i)) && !Main.gw.enemyObjects.get(i).enemydead) {
				if(!Main.gw.enemyObjects.get(i).enemydead) {
					Main.gw.player.hit();
					Main.gw.enemyObjects.get(i).hit(true);
				}

			}
		}
		
		
		for(int i = 0;i < Main.gw.shotObjects.size();i++) {
			s = Main.gw.shotObjects.get(i);
			for(int y = 0;y < Main.gw.enemyObjects.size();y++){
				e = Main.gw.enemyObjects.get(y);
				if(collisionRect(e, s)  && !Main.gw.enemyObjects.get(y).enemydead) {
					Main.gw.enemyObjects.get(y).hit(false);
					Main.gw.shotObjects.remove(i);
				}
				e= null;
			}
			s = null;
		}
	}
	
	private boolean collisionRect(GameObject r1, GameObject r2){
//		if(r1.x + r1.w > r2.x) {
//			if(r2.x + r2.w > r1.x) {
//				if(r1.y + r1.h > r2.y) {
//					if(r2.y + r2.h > r1.y) { <- Collision-Debugger
//						return true;
//					}
//				}
//			}
//		}
//		return false;
		
		return r1.x + r1.w > r2.x && r2.x + r2.w > r1.x && r1.y + r1.h > r2.y && r2.y + r2.h > r1.y;
	}
}
