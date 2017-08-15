package day5;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Name {
	public static void main(String[] args) {
		Robot x = new Robot();
		x.setSpeed(10);
		x.setPenWidth(50);
		x.setPenColor(Color.magenta);
		x.hide();
		x.penDown();
		x.setX(800);
		x.setY(400);
		
		x.turn(90);
		x.move(100);
		
		x.setX(850);
		x.turn(90);
		x.move(200);
		x.turn(90);
		x.move(50);
		
		x.setX(950);
		x.setY(600);
		x.move(10);
		
		x.setX(1000);
		x.setY(400);
		x.turn(-90);
		x.move(200);
		
		x.setY(400);
		x.turn(-90);
		x.move(100);
		x.turn(90);
		x.move(100);
		x.turn(90);
		x.move(100);
		
		x.setX(1150);
		x.setY(600);
		x.turn(180);
		x.move(10);
	}
}
