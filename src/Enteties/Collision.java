package Enteties;

public class Collision {
	public static boolean rectangleRectangleCollision(Sprite pSprite1, Sprite pSprite2) {
		if(pSprite1.getX() <= pSprite2.getX() + pSprite2.getWidth()) {
			if(pSprite1.getX() + pSprite1.getWidth() >= pSprite2.getX()) {
				if(pSprite1.getY() <= pSprite2.getY() + pSprite2.getHight()) {
					if(pSprite1.getY() + pSprite1.getHight() >= pSprite2.getY()) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
