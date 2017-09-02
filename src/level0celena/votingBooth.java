package level0celena;

import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("what is your age?");
		int age = Integer.parseInt(input);
		if (age >= 18) {
			JOptionPane.showMessageDialog(null, "yes,your 18 you can enter");

		} else {
			JOptionPane.showMessageDialog(null, "leave now!");
		}
	}
}
