package mvc;

import javax.swing.JFrame;

public class frame {
	
	public static void main(String[] args) {
		login l = new login();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(400,500);
		l.setLocationRelativeTo(null);
		l.setVisible(true);
	}
}
