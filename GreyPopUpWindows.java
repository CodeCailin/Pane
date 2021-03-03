import javax.swing.*;



public class GreyPopUpWindows {


	public static void main (String [] args){

		String name="";
		int age;
		age=0;


	name=JOptionPane.showInputDialog(null,"What is your name?");
	age=Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age?"));

	JOptionPane.showMessageDialog(null,"Hello " + name + " your age is " + age);
}
}