package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot x = new Robot();
	
	void go() {
		//drawTriangle(100); // 3. delete this line (used only for testing)
		x.setSpeed(10);
		x.hide();
		x.penDown();
		// 6. Make the robot go as fast as possible
		int y = 50;
		// 4. make a variable to hold the length of the triangle and set it to 50
		for (int i = 0; i < 60; i++) {
			x.setRandomPenColor();
			y = y + 10;
			drawTriangle(y);
			x.turn(6);
		}
		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			x.move(length);
			x.turn(360/3);
		}	
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
