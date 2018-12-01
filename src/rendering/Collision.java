package rendering;

import entities.GameObject;
import entities.Shot;
import main.Main;
import entities.Enemy;

public class Collision {

	public void testC(){
		Enemy e = null;
		for(int i = 0;i < Main.lvl.enemyObjects.size();i++) {
			e = Main.lvl.enemyObjects.get(i);
			if(collisionRect(Main.lvl.player, e)) {
				System.out.println("C: P-E");
			}
		}
		
		for(Shot s : Main.lvl.shotObjects) {
			for(Enemy f : Main.lvl.enemyObjects){
				if(collisionRect(f, s)) {
					System.out.println("C: S-E");
				}
			}
		}
	}
	
	public boolean collisionRect(GameObject r1, GameObject r2){ // - r2.h war die scheße weswegen es nicht funktioniert hat
		return r1.x + r1.w > r2.x && r1.y + r1.h > r2.x -r2.h && r2.x + r2.w > r1.x && r2.y + r2.h > r1.y;
	}
}
