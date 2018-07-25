package section3;

import javax.swing.JOptionPane;

import javafx.geometry.Side;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
String s= JOptionPane.showInputDialog("enter and adjective");
		// Get the user to enter a type of liquid
String j =JOptionPane.showInputDialog("enter a type of liqiud");
		// Get the user to enter a body part
String n=JOptionPane.showInputDialog("enter a body part");
		// Get the user to enter a verb
String p=JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
String m=JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more "+s+" during the day, so cross the river at
		// night. Piranhas are attracted to fresh "+j+" and will most
		// likely take a bite out of your "+ n+" if you "+p". Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the "+m+". Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showInputDialog("Piranhas are more "+s+" during the day, so cross \n the river at " +
				 "night.  Piranhas are attracted to fresh "+j+" and will most"+
				 "likely take a bite \n out of your "+ n+" if you "+p+". Whatever "+
				 "you do, if you have an open wound, \n try to find another way to get" +
				"back to the "+m+". Good luck!");

	}
}

