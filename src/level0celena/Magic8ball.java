// Copyright Wintriss Technical Schools 2013
package level0celena;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(5);
		System.out.println(randomNumber);
		for (int i = 0; i < 3; i++) {
			JOptionPane.showInputDialog("enter a yes or no question");
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "yes");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "no");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
			} else {
				JOptionPane.showMessageDialog(null, "Sorry I dont know your answer");
			}
		}

	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new
	// Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
