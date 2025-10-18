
import java.util.Scanner;
public class SalaryApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // variables
        double baseSalary;
        double overtimeHours;
        double overtimeRate;
        double totalPay;

        //object
        Salary s;
        s = new Salary();

        //inputs
        System.out.print("Enter your monthly base salary: ");
        baseSalary = scan.nextDouble();

        System.out.print("Enter your over time hours: ");
        overtimeHours = scan.nextDouble();

        System.out.print("Enter your over time rate: ");
        overtimeRate = scan.nextDouble();

        //set
        s.setBaseSalary(baseSalary);
        s.setOvertimeHours(overtimeHours);
        s.setOvertimeRate(overtimeRate);

        //compute
        s.computeTotalPay();

        //get
        totalPay = s.getTotalPay();

        //output
        System.out.print("Your total pay is: "+ totalPay);
    }
}
