package rendering;

import entities.GameObject;
import entities.Shot;
import main.Main;
import entities.Enemy;

public class Collision {

	public void testC(){
		for(Enemy e : Main.lvl.enemyObjects) {
			if(collisionRect(Main.lvl.player, e)) {
				System.out.println("C: P-E");
			}
		}
		
		for(Shot e : Main.lvl.shotObjects) {
			for(Enemy f : Main.lvl.enemyObjects){
				if(collisionRect(f, e)) {
					System.out.println("C: S-E");
				}
			}
		}
	}
	
	public boolean collisionRect(GameObject r1, GameObject r2){
	    return r1.y < r2.y + r2.h && r1.y + r1.h > r2.x && r1.x + r1.w > r2.x && r1.x < r2.x + r2.w;
	}
}
