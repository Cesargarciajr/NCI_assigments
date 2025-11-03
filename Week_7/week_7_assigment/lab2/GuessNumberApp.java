import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GuessNumberApp{
    public static void main(String[] args){
        
        //objects
        Scanner scan = new Scanner(System.in);
        GuessNumber guess = new GuessNumber();

        //array that stores all guesses across all games
        List<Integer> allGuesses = new ArrayList<>(); // accumulates across games

        //menu to check playagain status
        boolean playAgain = true;
        while (playAgain) {
            //generating random number
            int randomNum = (int)(Math.random() * 11); // 0-10 inclusive
            
            //setting user input to instantiable class
            guess.setRandomNum(randomNum);

            //storing input guesses for this game
            List<Integer> gameGuesses = new ArrayList<>(); // store guesses for this game
            
            //initializing hint variable
            String hint = "";

            //
            System.out.println("\nNew game! You have 3 attempts.");

            //counting rounds
            for (int i = 1; i <= 3; i++) {
                System.out.println("Round " + i);
                System.out.print("Guess the number between 0-10: ");
                int userInput = scan.nextInt();

                //adding to array guesses collected from userinput
                gameGuesses.add(userInput);
                allGuesses.add(userInput);

                guess.setUserInput(userInput);
                guess.compare();
                hint = guess.getResult();
                System.out.println(hint);

                //checking if userinput guess matches the number
                if ("YOU GOT IT!".equals(hint)) {
                    System.out.println("CONGRATULATIONS!!!");
                    break;
                }

                //checking if round counter
                if (i == 3) {
                    System.out.println("GAME OVER!!! The number was: " + randomNum);
                }
            }

            //printing all guesses for the game
            System.out.println("Your guesses this game: " + gameGuesses);

            //checking if user wants to play again
            System.out.print("Play again? (y/n): ");
            String answer = scan.next().trim();
            playAgain = answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
        }

        //printing all guesses across all game sessions
        System.out.println("All guesses across all games sessions: " + allGuesses);
        scan.close();
    }
}