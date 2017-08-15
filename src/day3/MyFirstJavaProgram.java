package day3;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot R2D2 = new Robot();
		Robot C3PO = new Robot();
		R2D2.moveTo(100, 300);
		R2D2.penDown();
		R2D2.setSpeed(10);
		R2D2.setPenColor(Color.magenta);
		for (int i = 0; i < 8; i++) {
			R2D2.move(100);
			R2D2.turn(45);
		}
		C3PO.penDown();
		C3PO.setSpeed(10);
		C3PO.setPenColor(Color.CYAN);
		for (int i = 0; i < 6; i++) {
			C3PO.move(100);
			C3PO.turn(60);
		}
	}
}
