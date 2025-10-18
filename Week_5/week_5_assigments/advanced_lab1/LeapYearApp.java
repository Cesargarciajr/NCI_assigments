import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args){
        //vars
        int inputYear;
        String isLeapYear;

        //object
        Scanner scan= new Scanner(System.in);
        LeapYear checkLeapYear = new LeapYear();

        //input
        System.out.print("Insert a year to check if it is a Leap Year:  ");
        inputYear = scan.nextInt();
        
        //set
        checkLeapYear.setInputYear(inputYear);

        //compute
        checkLeapYear.checkLeapYear();

        //get
        isLeapYear = checkLeapYear.getLeapYear();

        //output
        System.out.println(inputYear+isLeapYear);

    }
}
