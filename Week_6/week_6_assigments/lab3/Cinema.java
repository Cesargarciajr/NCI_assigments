public class Cinema{
    //vars
    private int age;
    private int numTickets;
    private int total;

    //set
    public void setAge(int age){
        this.age=age;
    }
    
    public void setNumTickets(int numTickets){
        this.numTickets=numTickets;
    }

    //Compute
    public void calculateTotal(){
        if(age < 18){
            total = numTickets * 10;
        } else {
            total = numTickets * 15;
        }
    }

    //get
    public int getTotal(){
        return total;
    }
}
