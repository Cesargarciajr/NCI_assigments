//importing Scanner tool
import java.util.Scanner;

//declaring main class
public class MonthlyWageApp{
    public static void main(String[] args){
        //setting Scanner
        Scanner input = new Scanner(System.in);

        //Declaring variables
        double wages;
        double hours;
        double hourlyWage;
        double yearlyWage;

        //Objects
        MonthlyWage calc;
        calc=new MonthlyWage();

        //Inputs just added some ASCII Art for design purpose.
        System.out.println("Welcome to your hourly wages calculator!");
        System.out.println("           _.-------._\n" + //
                        "        _-'_.------._ `-_\n" + //
                        "      _- _-          `-_/\n" + //
                        "     -  -\n" + //
                        " ___/  /______________\n" + //
                        "/___  .______________/\n" + //
                        " ___| |_____________\n" + //
                        "/___  .____________/\n" + //
                        "    \\  \\\n" + //
                        "     -_ -_             /|\n" + //
                        "       -_ -._        _- |\n" + //
                        "         -._ `------'_./\n" + //
                        "            `-------'");
        System.out.print("Please enter your monthly wage: ");
        wages = input.nextDouble();
        
        System.out.print("Please enter your weekly hours: ");
        hours = input.nextDouble();

        //Sets
        calc.setWages(wages);
        calc.setHours(hours);

        //Compute
        calc.calculateHourly();
        calc.calculateYearly();

        //Get
        hourlyWage = calc.getHourly();
        yearlyWage = calc.getYearly();

        //Ouput
        System.out.println("Your hourly rate is: "+ hourlyWage);
        System.out.println("Your yearly rate is: "+ yearlyWage);
        if(yearlyWage < 30000){
            System.out.println("You're POOR!! BYE!");
        } else {
        System.out.println("You're RICH!! BYE!");
        }
    }
}
