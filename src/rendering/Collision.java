package rendering;

import entities.GameObject;
import entities.Shot;
import main.Main;
import entities.Enemy;

public class Collision {

	public void testC(){
		for(int i = 0; i< Main.lvl.shotObjects.size(); i++) {
			if(collisionRect(Main.lvl.player, Main.lvl.shotObjects.get(i))) {
				System.out.println("C: S-E");
				Enemy.bodycollision =true;
			}
			
		}
		
		for(Enemy e : Main.lvl.enemyObjects) {
			if(collisionRect(Main.lvl.player, e)) {
				System.out.println("C: P-E");
			}
		}
		
		for(Shot e : Main.lvl.shotObjects) {
			for(Enemy f : Main.lvl.enemyObjects){
				if(collisionRect(f, e)) {
					System.out.println("C: P-E");
				}
			}
			
		}
		
	}
	
		
//	public boolean rectangleRectangleCollision(GameObject a, GameObject b) {
//		if (a.getX() + a.getW() <= b.getX() + b.getW()) { // +58 because of the detection area behind the enemy
//			if (a.getX() + a.getX() >= b.getW()) { // +80 because of the detection area before the enemy
//				if (a.getY() + a.getH() <= b.getY() + b.getH()) {
//					if (a.getY() + a.getH() >= b.getY()) {
//						System.out.println("C");
//						return true;
//					}
//				}
//			}
//		}
//
//		return false;
//	}
	
	public boolean collisionRect(GameObject r1, GameObject r2){
	    return r1.y < r2.y + r2.h && r1.y + r1.h > r2.x && r1.x + r1.w > r2.x && r1.x < r2.x + r2.w;
	}
}
