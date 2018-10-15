  package engine;

public class Main {
	static Game g;
	static KeyHandler k;
	static Gui gu;
	static Variables v;
	static Label l;
	static Sound s;
	
	
	public static void main(String[] args) {
		g = new Game();
		k = new KeyHandler();
		gu =new Gui();
		v = new Variables();
		l = new Label();
		s = new Sound();
		l.Iconsetzen();
		
	}
}

