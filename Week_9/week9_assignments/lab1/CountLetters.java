public class CountLetters {
    //vars
    private String userInput;
    private int numLetters;
    
    //set
    public void setUserInput(String useInput){
        this.userInput = useInput;
    }

    //compute
    public void countingLetters(){
        if (userInput == null) {
            numLetters = 0;
            return;
        }
        // reset and count
        numLetters = userInput.length();
    }

    //get
    public int getNumLetters(){
        return numLetters;
    }
}

