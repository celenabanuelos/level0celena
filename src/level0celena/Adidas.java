package level0celena;

import javax.swing.JOptionPane;

public class Adidas {
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "pizza is the best");
		String name=JOptionPane.showInputDialog("what is name");
	JOptionPane.showMessageDialog(null, "hello "+ name);
	String favorite=JOptionPane.showInputDialog(null, "what food do you like");
	JOptionPane.showMessageDialog(null, favorite+ "are awesome");
	}
}
