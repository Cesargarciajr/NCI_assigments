import java.util.Scanner;

public class CinemaApp{
    public static void main(String[] args){
        //setting up Scanner object
        Scanner scan = new Scanner(System.in);

        //vars
        int age;
        int numTickets;
        double total;

        //object
        Cinema calcTickets;
        calcTickets=new Cinema();

        //input
        System.out.println("┌──────────────────────────────────────────────────────────────────┐\n" + //
                        "│            Welcome to CTPS! (Cinema Ticket Purchase System )     |\n" + //
                        "|                                                                  │\n" + //
                        "│            ██████╗ ██╗███╗   ██╗╔███████╗███╗   ███╗ █████╗      │\n" + //
                        "│           ██╔════╝ ██║████╗  ██║║██╔════╝████╗ ████║██╔══██╗     │\n" + //
                        "│           ██║      ██║██╔██╗ ██║║█████╗  ██╔████╔██║███████║     |\n" + //
                        "│           ██║      ██║██║╚██╗██║║██╔══╝  ██║╚██╔╝██║██╔══██║     │\n" + //
                        "│           ╚██████╗ ██║██║ ╚████║║███████╗██║ ╚═╝ ██║██║  ██║     │\n" + //
                        "│            ╚═════╝ ╚═╝╚═╝  ╚═══╝╚═══════╝╚═╝     ╚═╝╚═╝  ╚═╝     │\n" + //
                        "│                                                                  │\n" + //
                        "│                              ADMIT ONE                           │\n" + //
                        "│                  Enjoy the movie and the popcorn!                │\n" + //
                        "│                                                                  │\n" + //
                        "└──────────────────────────────────────────────────────────────────┘\n" + //
                        "");
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        System.out.print("How many tickets: ");
        numTickets = scan.nextInt();

        //set
        calcTickets.setAge(age);
        calcTickets.setNumTickets(numTickets);

        //compute
        calcTickets.calculateTotal();

        //get
        total = calcTickets.getTotal();

        //output
        System.out.println("Total price is: "+ total+" €");
        System.out.println("Thank you!");
    }
}