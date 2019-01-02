package rendering;


import javax.swing.JFrame;
import main.Main;
import main.Variables;

public class Frame {
	public Frame() {
		Variables.jf1 = new JFrame();
		Variables.jf1.setSize(Variables.screenwidth, Variables.screenhight);
		Variables.jf1.setLocationRelativeTo(null);
		Variables.jf1.setLayout(null);
		Variables.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.jf1.setTitle("Gunrunner");
		Variables.jf1.setResizable(false);
		Variables.jf1.requestFocus();
		Variables.jf1.addKeyListener(Main.kh);
		Variables.jf1.setIconImage(Variables.icon);
		Variables.jf1.setVisible(true);

		Variables.lbl = new Label();
		Variables.lbl.setBounds(0, 0, Variables.screenwidth, Variables.screenhight);
		Variables.lbl.setVisible(true);
		Variables.jf1.add(Variables.lbl);
	}
}