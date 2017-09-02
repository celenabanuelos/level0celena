package level0celena;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How tall are you?");
		int height = Integer.parseInt(input);
		if (height >= 48) {
			JOptionPane.showMessageDialog(null, "Welcome, to the ride!");
		}else{
			JOptionPane.showMessageDialog(null, "Sorry you have to grow a little more");
		}
	}
}
