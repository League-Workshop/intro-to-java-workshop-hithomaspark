package day3;

import javax.swing.JOptionPane;

public class HellowWorld {
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Hello World");
		//System.out.println("Hello World");
		
		System.out.println("Nice Hair");
		System.out.println("You're fast at swimming");
		System.out.println("Nice Shoes");
		
		String x = JOptionPane.showInputDialog("What is your name");
		System.out.println("Hello " + x);
	}
}
