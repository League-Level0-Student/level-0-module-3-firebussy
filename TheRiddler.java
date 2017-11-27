//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String t=JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (t.equals("incorrect")) {
	JOptionPane.showMessageDialog(null, "Correct score: " + ++score);
} 
else {
	JOptionPane.showMessageDialog(null, "Wrong " + "The Answer Is Incorrect"+ --score);
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String j=JOptionPane.showInputDialog(null, "What is at the end of a rainbow?");

// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (j.equals("w")) {
JOptionPane.showMessageDialog(null, "Correct score: " + ++score);
} 
else {
JOptionPane.showMessageDialog(null, "Wrong " + "The Answer Is w"+ --score);
}
String l=JOptionPane.showInputDialog(null, "What kind of tree can you carry in your hand?");

//4. If they got the answer right, pop up "correct!" and increase the score by one
if (l.equals("palm")) {
JOptionPane.showMessageDialog(null, "Correct score: " + ++score);
} 
else {
JOptionPane.showMessageDialog(null, "Wrong " + "The Answer Is palm"+ --score);
}

		// 2. Make a pop up to show the score.
		
	}
}

