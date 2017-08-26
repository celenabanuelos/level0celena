package level0celena;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what is your name?");
		if (name.toLowerCase().equals("betzaida")) {
			JOptionPane.showMessageDialog(null, "your new glasses are remarkable");
		} else if (name.toLowerCase().equals("wendy")) {
			JOptionPane.showMessageDialog(null, "your headband is remarkable");
		} else if (name.toLowerCase().equals("angel")) {
			JOptionPane.showMessageDialog(null, "you are remarkable at coding");
		} else {
			JOptionPane.showMessageDialog(null, "you are remarkable");
		}
	}
}