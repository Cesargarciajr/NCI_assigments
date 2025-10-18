//instatiable
public class SimpleAdditionUserInput {
    //declare variables
    private int x;
    private int y;
    private int ans;

    //constructor
    public SimpleAdditionUserInput(){
        x=0;
        y=0;
        ans=0;
    }

    //set
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    //computer/process
    public void computeAns(){
        ans=x+y;
    }

    //get
    public int getAns(){
        return ans;
    }
}
