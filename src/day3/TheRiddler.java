package day3;

import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
	        // 1. Make a variable to hold the score
		String x = JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		String y = JOptionPane.showInputDialog("What kind of tree can you carry in your hand?");
		String z = JOptionPane.showInputDialog("There was a green house. Inside the green house there was a white house. Inside the white house there was a red house. Inside the red house there were lots of babies. What is it?");
	        // 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		if (x.equalsIgnoreCase("man")) {
			JOptionPane.showMessageDialog(null, "You got riddle #1 correct!");
			score = score + 1;
		} else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is man");
		}
		
		if (y.equalsIgnoreCase("palm")) {
			JOptionPane.showMessageDialog(null, "You got riddle #2 correct!");
			score = score + 1;
		} else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is palm");
		}
		
		if (z.equalsIgnoreCase("a watermelon")) {
			JOptionPane.showMessageDialog(null, "You got riddle #3 correct!");
			score = score + 1;
		} else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is a watermelon");
		}
		
		System.out.println("Your total score is " + score + " out of 3");
	        // 4. If they got the answer right, pop up "correct!" and increase the score by one

	        // 5. Otherwise, say "wrong" and tell them the answer

	        // 6. Add some more riddles

	        // 2. Make a pop up to show the score.
	        
	}
}
