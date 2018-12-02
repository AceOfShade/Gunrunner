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
			}
			e=null;
		}
		
		
		for(int i = 0;i < Main.lvl.shotObjects.size();i++) {
			s = Main.lvl.shotObjects.get(i);
			for(int y = 0;y < Main.lvl.enemyObjects.size();y++){
				e = Main.lvl.enemyObjects.get(y);
				if(collisionRect(e, s)) {
					System.out.println("C: S-E");
				}
				e= null;
			}
			System.out.println(s);
			s = null;
		}
	}
	
	public boolean collisionRect(GameObject r1, GameObject r2){ // - r2.h war die scheße weswegen es nicht funktioniert hat
		if(r1.x + r1.w > r2.x) {
			if(r1.y + r1.h > r2.h) {
				if(r2.x + r2.w < r1.x) {
					if(r2.y - r2.h > r1.y) {
						return true;
					}
				}
			}
		}
		return false;
//		return r1.x + r1.w > r2.x && r1.y + r1.h > r2.x -r2.h && r2.x + r2.w > r1.x && r2.y + r2.h > r1.y;
	}
}
