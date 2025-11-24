import java.util.Scanner;
public class ReverseApp {
    public static void main(String[] args){
        //vars
        String userInput;
        String reversed;
        //objects
        Reverse rev = new Reverse();
        Scanner scan  = new Scanner(System.in);
        //input
        System.out.print("Enter a message to be reversed: ");
        userInput = scan.nextLine();
        scan.close();
        //set
        rev.setUserInput(userInput);
        //compute
        rev.reverseString();
        //get
        reversed=rev.getReversed();
        //output
        System.out.println(reversed);
    }
}
