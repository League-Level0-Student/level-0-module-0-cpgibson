package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	int score = 0;	
		// ASK A QUESTION AND CHECK THE ANSWER
	
				// 2.  Ask the user a question 
				String questionone = JOptionPane.showInputDialog("What is 9+10?");
				// 3.  Use an if statement to check if their answer is correct
	if (questionone.equalsIgnoreCase("19"))	{
		score += 1;
		JOptionPane.showMessageDialog(null, "Correct!");
	}
	else JOptionPane.showMessageDialog(null, "Incorrect :(");
	
	String questiontwo = JOptionPane.showInputDialog("What is 17 * 3?");
		if (questiontwo.equalsIgnoreCase("51")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct!");
	}
		else JOptionPane.showMessageDialog(null, "Incorrect :(");	
	
	String questionthree = JOptionPane.showInputDialog("What is 144/12?");
	if (questionthree.equalsIgnoreCase("12")) {
		score +=1;
		JOptionPane.showMessageDialog(null, "Correct!");
	}
	else JOptionPane.showMessageDialog(null, "Incorrect :(");	
	// 4.  if the user's answer was correct, add one to their score 
	JOptionPane.showMessageDialog(null, "Your final score was " + score +"/3.");	
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
