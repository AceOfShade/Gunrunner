package at.gunrunner.rendering;


import javax.swing.JFrame;

import at.gunrunner.inputs.Resources;
import at.gunrunner.main.*;

public class Frame {
	public static int screenwidth = 800;
	public static int screenhight = 600;
	
	public Frame() {
		JFrame jf = new JFrame();
		jf.setSize(screenwidth, screenhight);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("Gunrunner");
		jf.setResizable(false);
		jf.requestFocus();
		jf.addKeyListener(Main.kh);
		jf.setIconImage(Resources.icon);
		jf.setVisible(true);

		Label lbl = new Label();
		lbl.setBounds(0, 0, screenwidth, screenhight);
		lbl.setVisible(true);
		jf.add(lbl);
	}
}