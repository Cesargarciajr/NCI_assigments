import java.util.Scanner;
public class PositiveOrNegativeApp {
    public static void main(String[] args){
        //var
        int userInput;
        String result;
        
        //object
        Scanner scan = new Scanner(System.in);
        PositiveOrNegative checker = new PositiveOrNegative();

        //input
        System.out.print("Please input a number positive or negative: ");
        userInput = scan.nextInt();

        //set
        checker.setUserInput(userInput);
    
        //compute
        checker.checkPositiveOrNegative();

        //get
        result = checker.getResult();

        //output
        System.out.println(result);
    }
}
