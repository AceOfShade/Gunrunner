package rendering;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import main.Main;
import main.Variables;

public class Gui {
	JFrame jf1;
	public Gui(){
		jf1 = new JFrame();
		jf1.setSize(Variables.screenwidth, Variables.screenhight);
		jf1.setLocationRelativeTo(null);
		jf1.setLayout(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setTitle("Gunrunner");
		jf1.setResizable(false);
		jf1.requestFocus();
		jf1.addKeyListener((KeyListener) new KeyHandler());
		jf1.setIconImage(Variables.icon);
		jf1.setVisible(true);
		jf1.add(Main.lbl);
		jf1.setIconImage(Variables.icon);
	}
}