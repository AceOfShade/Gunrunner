package abilitys;

import java.awt.Graphics;

import entities.GameObject;
import inputs.Resources;

public class Idk extends GameObject{
	public int way;
	int e = 0;
	
	public Idk(float enemyX,float enemyY) {
		super(enemyX + 55 , enemyY + 30 , 51, 61);
		way = 50;
	}
	
	@Override
	public void render(Graphics g) {
		
		if(e == 20) {
			way++;
			e = 0;
		}else {
			e++;
		}
		g.drawImage(Resources.kill, (int)(x), (int)(y) - way, w, h, null);
		
	}


}
