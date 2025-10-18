public class Random {
    //vars
    private double randomNum;
    private String result;

    // set
    public void setRandomNum(double randomNum){
        this.randomNum=randomNum;
    }

    //compute
    public void compareRandomNum(){
        if(randomNum < 10){
            result="Random number is below 10";
        } 
        else if(randomNum > 10){
            result="Random number is above 10";
        } else {
            result="Random number is 10";
        }
    }

    //get
    public String getResult(){
        return result;
    }
}