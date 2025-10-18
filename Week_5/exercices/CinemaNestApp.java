import javax.swing.JOptionPane;
public class CinemaNestApp{
	public static void main(String [] args){
	//Vars
	int age;
	int numberTickets;
	int isWeekday;
	double totalPrice;

	//Objects
	CinemaNest CiNest=new CinemaNest();

	//Input
	String[] options={"Weekday", "Weekend"};
	isWeekday=JOptionPane.showOptionDialog(null, "Select one of the options", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	age=Integer.parseInt(JOptionPane.showInputDialog(null, "Insert your age"));
	numberTickets=Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the desired number of tickets"));

	//Set
	CiNest.setAge(age);
	CiNest.setNumberTickets(numberTickets);
	CiNest.setIsWeekday(isWeekday);

	//Compute
	CiNest.calTotalPrice();

	//Get
	totalPrice=CiNest.getTotalPrice();


	//Output
	JOptionPane.showMessageDialog(null, "The total price is EUR " +totalPrice);
	}
}