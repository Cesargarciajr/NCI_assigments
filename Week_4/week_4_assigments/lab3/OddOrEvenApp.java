import java.util.Scanner;
public class OddOrEvenApp {
    public static void main(String[] args){
        //var
        int userInput;
        String result;
        
        //object
        Scanner scan = new Scanner(System.in);
        OddOrEven checker = new OddOrEven();

        //input
        System.out.print("Please input a number: ");
        userInput = scan.nextInt();

        //set
        checker.setUserInput(userInput);
    
        //compute
        checker.checkOddOrEven();

        //get
        result = checker.getResult();

        //output
        System.out.println(result);
    }
}
