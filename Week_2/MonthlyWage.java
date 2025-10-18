import javax.swing.JOptionPane;
public class MonthlyWage {
    public static void main(String[] args){

        // Declaring variables, inputs and parsing doubles
        double wages = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your monthly wages: "));
        double hours= Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weekly hours "));

        // Processing
        double result = wages / 4.0 / hours;
        
        // Output
        JOptionPane.showMessageDialog(null, "Your hourly wage is: " + result );
    }
}
