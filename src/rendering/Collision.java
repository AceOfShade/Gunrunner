package rendering;

import entities.GameObject;
import main.Main;
import entities.Enemy;

public class Collision {

	public void testC(){
		for(int i = 0; i< 0; i++) {
			if(rectangleRectangleCollision(Main.lvl.player, Main.lvl.shotObjects.get(i))) {
				System.out.println("C: S-E");
				Enemy.bodycollision =true;
			}
			
		}
		for(int i = 0; i< 0; i++) {
			if(rectangleRectangleCollision(Main.lvl.player, Main.lvl.enemyObjects.get(i))) {
				System.out.println("C: P-E");
			}
			
		}
		
	}
	
		
	public boolean rectangleRectangleCollision(GameObject a, GameObject b) {
		if ((a.getX()) + a.getW() <= b.getX() + b.getW()) { // +58 because of the detection area behind the enemy
			if ((a.getX()) + a.getX() >= b.getW()) { // +80 because of the detection area before the enemy
				if (a.getY() + a.getH() <= b.getY() + b.getH()) {
					if (a.getY() + a.getH() >= b.getY()) {
						System.out.println("C");
						return true;
					}
				}
			}
		}

		return false;
	}
}
