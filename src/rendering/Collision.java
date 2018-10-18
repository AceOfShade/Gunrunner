//package rendering;
//
//import entities.Player;
//import main.Main;
////import enteties.Sprite;
//import main.Variables;
//
//public class Collision {
//
//	public void testC() {
//		// P-E
////		for(int i = 0; i < Variables.freePos; i++) {
//		if (rectangleRectangleCollision(Main.lvl.player.x, Main.lvl.player.y, Variables.pheight, Variables.pwidth, Variables.ex,
//				Variables.ey, Variables.eheight, Variables.ewidth)) {
//			Variables.health -= 1;// wenn player auf enemy trifft passiert das was hier drin steht
//			System.out.println("Collision: Player-Enemy");
//		}
//
//		// S-E
//		for (int i = 0; i < Variables.freePos; i++) {
//			if (rectangleRectangleCollision(Variables.shots[i].sX, Variables.shots[i].sY, 9, 9, Variables.ex,
//					Variables.ey, Variables.eheight, Variables.ewidth)) {
//				System.out.println("Collision: Shot-Enemy");
//				// wenn shot enemy trifft passiert das was hier drin steht
//			}
//		}
//	}
//
//	public boolean rectangleRectangleCollision(int x1, int y1, int h1, int w1, int x2, int y2, int w2, int h2) {
//		if ((x1 + 58) + w1 <= x2 + w2) { // +58 because of the detection area behind the enemy
//			if ((x1 + 80) + w1 >= x2) { // +80 because of the detection area before the enemy
//				if (y1 + h1 <= y2 + h2) {
//					if (y1 + h1 >= y2) {
//						return true;
//					}
//				}
//			}
//		}
//		if (Variables.debug) {
//			System.out.println(x1 + " " + y1 + " " + h1 + " " + w1 + " " + x2 + " " + y2 + " " + w2 + " " + h2);
//		}
//
//		return false;
//	}
//}
