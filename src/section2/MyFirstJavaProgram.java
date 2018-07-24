package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Walee = new Robot("batman");
		Walee.setSpeed(100);
		Walee.sparkle();
		Walee.penDown();
		Walee.setSpeed(200);
		Walee.move(100);
		Walee.turn(90);
	    Walee.penUp();
		Walee.setSpeed(100);
	    Walee.move(100);
		Walee.turn(90);
		Walee.penDown();
		Walee.setSpeed(200);
		Walee.move(100);
		Walee.turn(90);
		Walee.penUp();
		Walee.move(200);
		Walee.turn(90);
	for(int i=0;i<2;i++) {Walee.move(100);
	Walee.penDown();
	Walee.turn(90);
	for(int j=0;j<2;j++);
	Walee.penUp();
	Walee.turn(90);
	}
	
	
	}
	
}

