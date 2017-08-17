package day5;

public class Beer {
	public static void main(String[] args) {
		for (int i = 99; i > 0; i--) {
			if(i > 1){
				System.out.println(i + " bottles of beer on the wall. " + i + " bottles of beer.");
				System.out.println("Take one down. Pass it around. " + (i - 1) + " bottles of beer on the wall.");
			}else {
				System.out.println(i + " bottles of beer on the wall. " + i + " bottle of beer.");
				System.out.println("Take one down. Pass it around. No more bottles of beer on the wall.");
			}
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}
