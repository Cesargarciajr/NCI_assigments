public class CountVowels {
   //vars
    private String userInput;
    private int numVowels;
    private String vowels = "AEIOU";
    private char ch;

    //set
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    //compute
    public void countingVowels(){
        numVowels = 0;
        if (userInput == null || userInput.isEmpty()) return;

        for (int i = 0; i < userInput.length(); i++) {
            ch = Character.toUpperCase(userInput.charAt(i));
            if (vowels.indexOf(ch) >= 0) {
                numVowels++;
            }
        }
    }

    //get
    public int getNumVowels() {
        return numVowels;
   }
}
