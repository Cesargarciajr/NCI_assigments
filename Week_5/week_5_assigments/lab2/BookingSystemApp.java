import java.util.Scanner;

public class BookingSystemApp {
    public static void main(String[] args){
        //vars
        int age=0;
        int numNights=0;
        String name;
        String msg;
        Double finalPrice;

        //object
        Scanner scan=new Scanner(System.in);
        BookingSystem calNights=new BookingSystem();

        //inputs
        System.out.println("Welcome to Hotel Booking System!");
        System.out.print("Please type in your name: ");
        name=scan.next();
        System.out.print("Please type in your age: ");
        age=scan.nextInt();
        System.out.print("How many nights are you staying? ");
        numNights=scan.nextInt();

        //set
        calNights.setAge(age);
        calNights.setNumNights(numNights);

        //compute
        calNights.calcTotalPrice();

        //get
        finalPrice=calNights.getFinalPrice();
        msg=calNights.getMsg();

        if(age>=18){
            System.out.println(name+" the price for "+numNights+" nights is "+finalPrice+" €. Your booking is confirmed!");
        } else {
            System.out.println(name+", "+msg);
        }

        
    }
}
