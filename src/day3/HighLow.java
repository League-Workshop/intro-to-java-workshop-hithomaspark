package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLow {
	public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100) + 1;
			// 2. Print out the random variable above
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++) {
				String x = JOptionPane.showInputDialog("Guess a number from 1-100");
				int y = Integer.parseInt(x);
				if(y == random){
					JOptionPane.showMessageDialog(null, "Win");
					System.exit(0);
				}else{
					if(y < random){
						JOptionPane.showMessageDialog(null, "Your guess was too low.");
					}else{
						JOptionPane.showMessageDialog(null, "Your guess was too high.");
					}
				}
			}
			JOptionPane.showMessageDialog(null, "You Lose");
				// 1. ask the user for a guess using a pop-up window, and save their response 

				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				
				// 5. if the guess is correct
					// 6. win
				// 7. if the guess is high
					// 8. tell them it's too high
				// 9. if the guess is low
					// 10. tell them it's too low

			// 12. tell them they lose
	}
}