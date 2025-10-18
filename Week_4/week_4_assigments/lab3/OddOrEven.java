public class OddOrEven {
    //vars
    int userInput;
    String result;
    
    //set
    public void setUserInput(int userInput){
        this.userInput=userInput;
    }

    //compute
    public void checkOddOrEven(){
        if(userInput == 0){
            result = "Number is 0!";
        } else if(userInput % 2 == 0){
            result = "Number is Even";
        } else {
            result = "Number is Odd";
        }
    }

    //get
    public String getResult(){
        return result;
    }
}
