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

      

        // input loop
        for(int i=1; i<=3; i++){
            
            //generating a random number between 0-20
            randomNum=(int)(Math.random() * 20); //casting the **Double** to an **Integer**
            guess.setRandomNum(randomNum);
                
            //printing round counter and input user guess.
            System.out.println("Round "+i);
            System.out.print("Guess the number between 0-20: ");
            userInput = scan.nextInt();
            
            // update object, compute and show hint
            guess.setUserInput(userInput);
            guess.compare();
            hint = guess.getResult();
            System.out.println(hint);

            //if hint is correct, exits the loop
            if (hint.equals("YOU GOT IT!")) {
                //print winner final msg
                System.out.println("CONGRATULATIONS!!!");
                break;
            } else if (i==3){ // checks if its final round before printing final msg
                // print looser final msg
                System.out.println("GAME OVER!!! Try again...");
            }
        }
    }
}