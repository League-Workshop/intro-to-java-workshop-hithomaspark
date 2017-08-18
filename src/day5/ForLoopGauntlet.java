package day5;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int j = 100; j >= 0; j--) {
			System.out.print(j + " ");
		}
		System.out.println(" ");
		for (int a = 0; a <= 100; a++) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println(" ");
		for (int b = 0; b <= 100; b++) {
			if (b % 2 == 1) {
				System.out.print(b + " ");
			}
		}
		System.out.println(" ");
		for (int c = 1; c <= 500; c++) {
			if (c % 2 == 0) {
				System.out.print(c + " even, ");
			} else {
				System.out.print(c + " odd, ");
			}
		}
		System.out.println(" ");
		for (int d = 1; d <= 6; d++) {
			for (int i = 1; i <= d; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.println("");
			}
		}
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 2; i < 20; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
}
