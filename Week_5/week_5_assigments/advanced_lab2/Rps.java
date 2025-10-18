public class Rps{
    //vars
    private int userInput;
    private int computerInput;
    private String resultMsg;

    //set
    public void setUserInput(int userInput){
        this.userInput=userInput;
    }

    public void setComputerInput(int computerInput){
        this.computerInput=computerInput;
    }

    //compute 0=rock 1=paper 2=scissors
    public void compareResult(){
        if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            resultMsg="YOU WON!!";
        } else if (computerInput==0 && userInput==2 || computerInput==1 && userInput==0 || computerInput==2 && userInput==1){
            resultMsg="YOU LOOSE!!";
        } else {
            resultMsg="IT'S A DRAW!!";
        }
    }

    //get
    public String getResult(){
        return resultMsg;
    }
}