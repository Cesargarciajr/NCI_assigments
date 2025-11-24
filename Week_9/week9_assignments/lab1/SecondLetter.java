public class SecondLetter {
    //vars
    private String userInput;
    private String secondLetterString;

    //set
    public void setUserInput(String useInput){
        this.userInput = useInput; // fixed: assign parameter to field
    }

    //compute
    public void computeSecondLetter(){
        if (userInput == null || userInput.isEmpty()) {
            secondLetterString = "";
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < userInput.length(); i += 2) {
            sb.append(userInput.charAt(i));
        }
        secondLetterString = sb.toString(); // fixed: use built string
    }

    //get
    public String getSecondLetterString(){
        return secondLetterString;
    }
}

