package enteties;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import main.Game;

public class Enemy extends Sprite{
	
	
	public Enemy(int pX, int pY, BufferedImage pImage, Game pGame) {
		
		super(pX, pY, pImage, pGame);
		
			
			}
	


	public int eX, eY, hp;
	
	
	/*
	public Enemy(int eX, int eY, int hp) {
		this.eX = eX;
		this.eY = eY;
		this.hp = hp;
	}
	public Enemy() {
		this.eX = 675;
		this.eY = 400;
		this.hp = 3;
	}
	*/
	
	
	@Override
	public void logic(float tpf) {
		setY(getY() + (int) (250 * tpf));
		
		
		ArrayList<?> a = getGame().getEnemys();
		for(int i = 0; i < a.size(); i++) {
			if(Collision.rectangleRectangleCollision(this, (Sprite) (a.get(i)))) {
				Player.health--;
			}
		}
	}
}
