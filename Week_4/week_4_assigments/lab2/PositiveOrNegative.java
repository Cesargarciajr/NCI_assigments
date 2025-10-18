public class PositiveOrNegative {
    //vars
    private int userInput;
    private String result;
    
    //set
    public void setUserInput(int userInput){
        this.userInput=userInput;
    }

    //compute
    public void checkPositiveOrNegative(){
        if(userInput == 0){
            result = "Number is 0!";
        } else if(userInput > 0){
            result = "Number is Positive!";
        } else {
            result = "Number is Negative!";
        }
    }

    //get
    public String getResult(){
        return result;
    }
}
