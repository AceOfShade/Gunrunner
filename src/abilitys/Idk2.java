package abilitys;

import java.awt.Graphics;

import entities.GameObject;
import inputs.Resources;
import main.Main;

public class Idk2 extends GameObject{
	public int way;
	
	public Idk2(boolean healthy) {
		super(Main.gw.player.x - 55 , Main.gw.player.y + 30 , 51, 61);
		way = 50;
	}

	@Override
	public void render(Graphics g) {
		way--;
			g.drawImage(Resources.hp, (int)(x), (int)(y), w, h, null);
		
	}


}
