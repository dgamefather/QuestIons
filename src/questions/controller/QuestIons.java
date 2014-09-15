package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class QuestIons
{
	private Scanner myScanner;
	
	public QuestIons()
	{
		myScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		askQuestIonsGUI();
	}
	
	private void askQuestIonsGUI()
	{
		/**
		 * Question 1
		 */
		String myAnswer = JOptionPane.showInputDialog(null, "What is your favorite video game?");
		/**
		 * Question Set A or B?
		 */
		if (myAnswer.equals("Ocarina of Time"))
		{
			JOptionPane.showMessageDialog(null, "Wow, " + myAnswer + " sounds like a fun game!");
			/**
			 * Question 2a
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Do you like to speed run " + myAnswer + " or casually play it?");
			/**
			 * Question 3a
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Sweet!  Have you ever tried playing Beyond Good & Evil?");
			/**
			 * Question 4a
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Did you like Beyond Good & Evil for its story or the gameplay?");
			JOptionPane.showMessageDialog(null, myAnswer + "?  Me too!");
		}
		else if (myAnswer.equals("OoT"))
		{
			JOptionPane.showMessageDialog(null, "Wow, " + myAnswer + " sounds like a fun game!");
			/**
			 * Question 2a
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Do you like to speed run " + myAnswer + " or casually play it?");
			/**
			 * Question 3a
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Sweet!  Have you ever tried playing Beyond Good & Evil?");
			/**
			 * Question 4a
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Did you like Beyond Good & Evil for its story or the gameplay?");
			JOptionPane.showMessageDialog(null, myAnswer + "?  Me too!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wow, " + myAnswer + " sounds like a fun game!");
			/**
			 * Question 2b
			 */
			myAnswer = JOptionPane.showInputDialog(null, "What other games do you like to play?");
			/**
			 * Question 3b
			 */
			myAnswer = JOptionPane.showInputDialog(null, "Sweet!  What types of games do you like to play?");
			/**
			 * Question 4b
			 */
			myAnswer = JOptionPane.showInputDialog(null, myAnswer + "?  Exciting!  Is playing games your favortie pasttime?");
			JOptionPane.showMessageDialog(null, myAnswer + "?  Me too!");
		}
		/**
		 * Question 5
		 */
		myAnswer = JOptionPane.showInputDialog(null, "Do you play it on Xbox, Playstation, Nintendo, or PC?");
		JOptionPane.showMessageDialog(null, "That's great!  :)");
		/**
		 * Question set A, B, C, or D?
		 */
		if (myAnswer.equals("Xbox"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How many games do you have on the Xbox?");
		}
		else if (myAnswer.equals("xbox"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How many games do you have on the Xbox?");
		}
		else if (myAnswer.equals("Playstation"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How many games do you have on the Playstation?");
		}
		else if (myAnswer.equals("playstation"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How many games do you have on the Playstation?");
		}
		else if (myAnswer.equals("Nintendo"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How many games do you have on the Nintendo?");
		}
		else if (myAnswer.equals("nintendo"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How many games do you have on the Nintendo?");
		}
		else if (myAnswer.equals("PC"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How old where you when you played your first PC game?");
		}
		else if (myAnswer.equals("pc"))
		{
			myAnswer = JOptionPane.showInputDialog(null, "How old where you when you played your first PC game?");
		}
		/**
		 * Question 7
		 */
		myAnswer = JOptionPane.showInputDialog(null, "How much is ___ + 10100 = 124564973?");
		if (myAnswer.equals("124554873"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			/**
			 * Question 8
			 */
			myAnswer = JOptionPane.showInputDialog(null, "What is the square root of 169?");
			if (myAnswer.equals("13"))
			{
				JOptionPane.showMessageDialog(null, "Correct!");
				/**
				 * Question 9
				 */
				myAnswer = JOptionPane.showInputDialog(null, "What is 69*128?");
				if (myAnswer.equals("8832"))
				{
					JOptionPane.showMessageDialog(null, "Correct!");
					/**
					 * Question 10
					 */
					myAnswer = JOptionPane.showInputDialog(null, "How many rings do I have in my pocket?");
					if (myAnswer.equals("1"))
					{
						JOptionPane.showMessageDialog(null, "Congradulations!  You have won the game!  :)");
						System.exit(0);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Sorry, that is incorrect.  :(");
						System.exit(0);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Sorry, that is incorrect.  :(");
					System.exit(0);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry, that is incorrect.  :(");
				System.exit(0);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, that is incorrect.  :(");
			System.exit(0);
		}
	}	
}
