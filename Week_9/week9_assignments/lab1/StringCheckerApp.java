import java.util.Scanner;

public class StringCheckerApp {
    public static void main(String[] args){
        //vars
        String userInput;
        int numLetters;
        int numVowels;
        String everySecondLetter;
        String formattedString;

        //object
        Scanner scan = new Scanner(System.in);
        CountLetters countLetters = new CountLetters();
        CountVowels countVowels = new CountVowels();
        SecondLetter secondLetter = new SecondLetter();
        ExaclamationString exc = new ExaclamationString();

        //inputs
        System.out.print("Enter a string to be formatted: ");
        userInput = scan.nextLine();
        scan.close();

        //set
        countLetters.setUserInput(userInput);
        countVowels.setUserInput(userInput);
        secondLetter.setUserInput(userInput);
        exc.setUserInput(userInput);

        //compute
        countLetters.countingLetters();
        countVowels.countingVowels();
        secondLetter.computeSecondLetter();
        exc.replaceVowelsWithExclamation();

        //get
        numLetters = countLetters.getNumLetters();
        numVowels = countVowels.getNumVowels();
        everySecondLetter = secondLetter.getSecondLetterString();
    formattedString = exc.getResult();

    // spaces: compute and output positions
    SpacePositions sp = new SpacePositions();
    sp.setUserInput(userInput);
    sp.computePositions();

    //output
    System.out.println("Number of letters of that string is: "+numLetters);
    System.out.println("Number of vowels of that string is: "+numVowels);
    System.out.println("Here is your new string with every second letter: "+everySecondLetter);
    System.out.println("Here is your new string replacing vowels for '!': "+formattedString);
    System.out.println("Number of spaces: " + (sp.getPositions() == null ? 0 : sp.getPositions().size()));
    System.out.println("Space positions (0-based): " + sp.getPositionsString());
    // optional 1-based view
    System.out.println("Space positions (1-based): " + (sp.getPositions() == null ? "[]" : sp.getPositions().stream().map(i -> i+1).toList()));
    }
}
