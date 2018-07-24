package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot Walee=new Robot("batman");
	void go() {
		// 4. Make the robot move as fast as possible
		Walee.setSpeed(200);
		// 5. Set the pen width to 5
         Walee.setPenWidth(20);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
         for (int i=0; i<75; i++) {
			// 7. Set the pen color to random
         Walee.setRandomPenColor();
			// 1. Call the drawSquare() method
         drawSquare();
			// 8. Turn the robot 90 degrees to the right
        Walee.turn(70);
         }
	}

	
	void drawSquare() {
		
		/* 3. Fill in the code to draw a square inside the method below. */   
		Walee.penDown();
		for (int i= 0; i<4; i++) {
			Walee.move(100);
			Walee.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



