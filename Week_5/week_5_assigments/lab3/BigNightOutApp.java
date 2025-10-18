import java.util.Scanner;
public class BigNightOutApp {
    public static void main(String[] args){
        //vars
        int year;
        String progCode="";
        String venue="";

        //object
        Scanner scan=new Scanner(System.in);
        BigNightOut findVenue= new BigNightOut();

        //input
        System.out.print("Welcome! Please insert your current year: ");
        year=scan.nextInt();
        System.out.print("Please insert your programme code: ");
        progCode=scan.next();

        //set
        findVenue.setYear(year);
        findVenue.setProgCode(progCode);

        //compute
        findVenue.findVenue();

        //get
        venue = findVenue.getVenue();

        //output
        System.out.println(venue);
    }
}
