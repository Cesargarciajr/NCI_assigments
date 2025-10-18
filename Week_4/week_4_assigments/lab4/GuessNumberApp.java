import java.util.Scanner;

public class GuessNumberApp{
    public static void main(String[] args){
        //var
        int randomNum;
        int userInput = -1;
        String hint = "";
        

        //object
        Scanner scan = new Scanner(System.in);
        GuessNumber guess = new GuessNumber();

        //input
        randomNum=(int)(Math.random() * 20); //casting the **Double** to an **Integer**
        guess.setRandomNum(randomNum);

        // input loop
        while (userInput != randomNum) {
            System.out.print("Guess the number: ");
            userInput = scan.nextInt();

            // update object, compute and show hint
            guess.setUserInput(userInput);
            guess.compare();
            hint = guess.getResult();
            System.out.println(hint);
        }
        System.out.println("CONGRATULATIONS!!");
    }
}
