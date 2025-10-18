public class GuessNumber {
    //vars
    private int randomNum;
    private int userInput;
    private String hint;

    //set
    public void setRandomNum(int randomNum){
        this.randomNum=randomNum;
    }

    public void setUserInput(int userInput){
        this.userInput=userInput;
    }

    //compute
    public void compare(){
        if(userInput > randomNum){
            hint = "Number is lower!";
        } else if(userInput < randomNum){
            hint = "Number is higher!";
        } else {
            hint = "YOU GOT IT!";
        }
    }

    //get
    public String getResult(){
        return hint;
    }
}
