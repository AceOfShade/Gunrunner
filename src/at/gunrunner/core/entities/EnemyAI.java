package at.gunrunner.core.entities;

import at.gunrunner.core.main.Main;

public class EnemyAI {
	public static void live() {
		for(int i = 0; i<Main.gw.enemyObjects.size();i++) {
			if(Main.gw.player.x < Main.gw.enemyObjects.get(i).x) {
				Main.gw.enemyObjects.get(i).x--;
			}else {
				Main.gw.enemyObjects.get(i).x++;
			}
			
		}
	}
}
