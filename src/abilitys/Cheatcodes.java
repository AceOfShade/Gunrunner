package abilitys;

public class Cheatcodes {
	public static char[] lastPressed = new char[6];
	private byte freiePos;
	
	public void p(char a) {
		if(freiePos != lastPressed.length) {
			lastPressed[freiePos] = a;
			freiePos++;
		}else {
			for(int i = 0; i< lastPressed.length;i++) {
				lastPressed[i]= lastPressed[i+1];
				lastPressed[lastPressed.length] = a;
			}
		}
	}
	
	public void cheat() {
		//xD
	}
}