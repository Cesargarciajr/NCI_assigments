import javax.swing.JOptionPane;
public class SimpleAddition{
	public static void main(String[] args){
		// Declarimg variables and inputs
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: "));
		int currentYear = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter current year: "));

		// Processing
		int birthYear = currentYear - age;
		
		// Output
		JOptionPane.showMessageDialog(null, "You were born in: " + birthYear);
	}
}