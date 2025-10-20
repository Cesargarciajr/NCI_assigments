import java.util.Scanner;

public class CinemaApp{
    public static void main(String[] args){
        //setting up Scanner object
        Scanner scan = new Scanner(System.in);

        //vars
        int age=0;
        int numTickets=0;
        int total=0;
        int numOrders=0;
        int grandTotal=0;

        //object
        Cinema calcTickets;
        calcTickets=new Cinema();

        //input
        System.out.print("How many orders would you like to make? ");
        numOrders=scan.nextInt();

        for (int i = 1; i <= numOrders; i++) {
                    System.out.println("\nOrder number #" + i + ":");
                    System.out.print("How many tickets: ");
                    numTickets = scan.nextInt();

                    total = 0;

                    // inner loop: ask age for each ticket
                    for (int n = 1; n <= numTickets; n++) {
                        System.out.print("Enter the age for ticket number #" + n + ": ");
                        age = scan.nextInt();

                        // calculate ticket price individually
                        calcTickets.setAge(age);
                        calcTickets.setNumTickets(1);
                        calcTickets.calculateTotal();

                        // add to this customer's total
                        total += calcTickets.getTotal();
                    }

                    System.out.println("Total price for this purchase: " + total + "€");
                    grandTotal += total; // add to overall total
                }


        //output
        System.out.println("Grand total for all customers: " + grandTotal + "€"+" for "+numOrders+" orders.");
    }
}