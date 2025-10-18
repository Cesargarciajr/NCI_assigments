// Instatiable Class
public class MonthlyWage{

    // Declaring variables
    private double wages;
    private double hours;
    private double hourlyWage;
    private double yearlyWage;

    // Set
    public void setWages(double wages){
        this.wages=wages;
    }
    public void setHours(double hours){
        this.hours=hours;
    }

    // Compute
    public void calculateHourly(){
        hourlyWage = wages/4.0/hours;
    }

     public void calculateYearly(){
        yearlyWage = wages*12;
    }

    // Get
    public double getHourly(){
        return hourlyWage;
    }
    public double getYearly(){
        return yearlyWage;
    }
}

