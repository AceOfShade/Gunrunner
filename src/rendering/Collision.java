package rendering;

import entities.GameObject;
import entities.Shot;
import main.Main;
import entities.Enemy;

public class Collision {

	public void testC(){
		Enemy e = null;
		Shot s = null;
		for(int i = 0;i < Main.lvl.enemyObjects.size();i++) {
			e = Main.lvl.enemyObjects.get(i);
			if(collisionRect(Main.lvl.player, e)) {
				System.out.println("C: P-E");
				Main.lvl.player.health--;
			}
			e=null;
		}
		
		
		for(int i = 0;i < Main.lvl.shotObjects.size();i++) {
			s = Main.lvl.shotObjects.get(i);
			for(int y = 0;y < Main.lvl.enemyObjects.size();y++){
				e = Main.lvl.enemyObjects.get(y);
				if(collisionRect(e, s)) {
					Main.lvl.player.kills++;
					System.out.println("C: S-E");
				}
				e= null;
			}
			s = null;
		}
	}
	
	public boolean collisionRect(GameObject r1, GameObject r2){
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
