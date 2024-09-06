package programs;

import javax.swing.JOptionPane;

public class GUIUserInput {

	public static void main(String[] args) {
	  
		String name = JOptionPane.showInputDialog("Enter your Name : ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age : "));
		
		JOptionPane.showMessageDialog(null,"Name : "+name+" and Age : "+age);

	}

}
