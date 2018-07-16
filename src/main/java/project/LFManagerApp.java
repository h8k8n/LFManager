package project;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LFManagerApp {
	
	private JFrame frame;
	
	private LFManagerApp() {
		init();
	}

	private void init() {
		this.frame=new JFrame("LFManagerApp");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.frame.setSize(new Dimension(400, 400));
		this.frame.setVisible(true);
	}

	public static void main(String[] args) {
		LFManagerApp app=new LFManagerApp();
	}
}
