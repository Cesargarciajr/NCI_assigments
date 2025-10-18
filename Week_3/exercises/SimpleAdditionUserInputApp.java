import java.util.Scanner;

public class SimpleAdditionUserInputApp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //declare vars
        int x;
        int y;
        int ans;
        
        //objects
        SimpleAdditionUserInput add;
        add=new SimpleAdditionUserInput();

        //inputs
        System.out.print("Enter first number: ");
        x= input.nextInt();
        System.out.print("Enter second number: ");
        y= input.nextInt();

        //set
        add.setX(x);
        add.setY(y);

        //compute
        add.computeAns();

        //get
        ans=add.getAns();

        //output
        System.out.println("Tem sum is: "+ans);
    }
}