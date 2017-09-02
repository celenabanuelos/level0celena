package level0celena;

import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(input);
		if (age >= 18) {
			JOptionPane.showMessageDialog(null, "Yes, you're 18 you can enter");

		} else {
			JOptionPane.showMessageDialog(null, "Leave now!");
		}
	}
}
