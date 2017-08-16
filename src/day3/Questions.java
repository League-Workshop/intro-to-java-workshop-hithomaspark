package day3;

import javax.swing.JOptionPane;

public class Questions {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Are you happy?");
		if(x.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}else{
			String y = JOptionPane.showInputDialog("Do you want to happy?");
			if(y.equalsIgnoreCase("Yes")){
				JOptionPane.showMessageDialog(null, "Change something");
			}else{
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}
}
