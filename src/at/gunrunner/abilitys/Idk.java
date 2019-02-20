package at.gunrunner.abilitys;

import java.awt.Graphics;

import at.gunrunner.entities.GameObject;
import at.gunrunner.inputs.Resources;

public class Idk extends GameObject{
	public int way;
	int e = 0;
	boolean healthy;
	float untilY;
	
	public Idk(float objectX, float objectY, boolean healthy) {
		super(objectX + 55 , objectY + 30 , 51, 61);
		way = 50;
		this.healthy = healthy;
		this.untilY = objectY +100;
	}
	
	@Override
	public void render(Graphics g) {
			way++;
		if(healthy) {
			g.drawImage(Resources.hp, (int)(x), (int)(y) - way, w, h, null);
		}else {
			g.drawImage(Resources.kill, (int)(x), (int)(y) - way, w, h, null);
		}
		
		
	}


}