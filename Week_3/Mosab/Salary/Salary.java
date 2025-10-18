
public class Salary{
    // variables
    private double baseSalary;
    private double overtimeHours;
    private double overtimeRate;
    private double totalPay;

    // set methods
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    
    // compute
    public void computeTotalPay() {
        this.totalPay = this.baseSalary + (this.overtimeHours * this.overtimeRate);
    }

    // get
    public double getTotalPay() {
        return this.totalPay;
    }
}
