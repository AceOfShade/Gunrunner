package abilitys;

import java.awt.Graphics;

import entities.GameObject;
import inputs.Resources;

public class Idk extends GameObject{
	public int way;
	int e = 0;
	boolean healthy;
	
	public Idk(float objectX, float objectY, boolean healthy) {
		super(objectX + 55 , objectY + 30 , 51, 61);
		way = 50;
		this.healthy = healthy;
	}
	
	@Override
	public void render(Graphics g) {
		
		if(e == 20) {
			way++;
			e = 0;
		}else {
			e++;
		}
		if(healthy) {
			g.drawImage(Resources.hp, (int)(x), (int)(y) - way, w, h, null);
		}else {
			g.drawImage(Resources.kill, (int)(x), (int)(y) - way, w, h, null);
		}
		
		
	}


}
