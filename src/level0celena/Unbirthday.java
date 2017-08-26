package level0celena;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("when's your birthday");
		if (birthday.equals("September 29")) {
			JOptionPane.showMessageDialog(null, "happy birthday!!!!!!!!");

		} else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
		}
	}
}
