public class BookingSystem {
    //vars
    private int numNights;
    private double pricePerNight=90.00;
    private int age;
    private double finalPrice;
    private String msg;

    //set
    public void setAge(int age){
        this.age=age;
    }

    public void setNumNights(int numNights){
        this.numNights=numNights;
    }

    //compute
    public void calcTotalPrice(){
        if(age>=18){
             finalPrice=numNights*pricePerNight;
        }
        else {
            msg = "Sorry, you're too young to book a hotel.";
        }
    }

    //get
    public String getMsg(){
        return msg;
    }

    public Double getFinalPrice(){
        return finalPrice;
    }
}
