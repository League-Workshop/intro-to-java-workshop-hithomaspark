package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		String e = "Correct";
		String f = "Wrong";
		
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		// 2. Catch the user's answer in a String
		// 3. If the user spelled the word correctly, speak "correct"
		// 4. Otherwise say "wrong"
		// 5. repeat the process for other words
		String x = "Potato";
		speak(x);
		
		String y = JOptionPane.showInputDialog("Enter the word");
		
		if(y.equalsIgnoreCase("potato")){
			speak(e);
		}else{
			speak(f);
		}
		
		String a = "accommodate";
		speak(a);
		String b = JOptionPane.showInputDialog("Enter the word");
		if(b.equalsIgnoreCase("accommodate")){
			speak(e);
		}else{
			speak(f);
		}
		
		String c = "conscience";
		speak(c);
		String d = JOptionPane.showInputDialog("Enter the word");
		if(d.equalsIgnoreCase("conscience")){
			speak(e);
		}else{
			speak(f);
		}
		
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


