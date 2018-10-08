package Engin;

public class Collision {
	public static boolean rectangleRectangleCollision(int py, int ey) {
		if(Variables.px <= Variables.ex + Variables.ewidth) {
			if(Variables.px + Variables.pwidth >= Variables.ex) {
				if(Variables.py <= ey + Variables.ehight) {
					if(Variables.py + Variables.phight >= Variables.ey) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
