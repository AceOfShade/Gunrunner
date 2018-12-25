package rendering;

import entities.GameObject;
import entities.Shot;
import main.Main;
import entities.Enemy;

public class Collision {

	public void testC(){
		Enemy e = null;
		Shot s = null;
		for(int i = 0;i < Main.gw.enemyObjects.size();i++) {
			e = Main.gw.enemyObjects.get(i);
			if(collisionRect(Main.gw.player, e)) {
				if(!Main.gw.enemyObjects.get(i).enemydead) {
					Main.gw.player.health--;
				}

			}
			e=null;
		}
		
		
		for(int i = 0;i < Main.gw.shotObjects.size();i++) {
			s = Main.gw.shotObjects.get(i);
			for(int y = 0;y < Main.gw.enemyObjects.size();y++){
				e = Main.gw.enemyObjects.get(y);
				if(collisionRect(e, s)) {
					Main.gw.enemyObjects.get(y).hit();
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
