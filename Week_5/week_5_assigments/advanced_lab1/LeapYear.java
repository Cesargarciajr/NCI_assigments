public class LeapYear {
    //vars
    private int inputYear;
    private String isLeapYear;

    //set
    public void setInputYear(int inputYear){
        this.inputYear=inputYear;
    }

    //compute
    public void checkLeapYear(){
        if(inputYear % 4 == 0) {
            if (inputYear %100 == 0) {
                if (inputYear%400 == 0) {
                    isLeapYear=" is a leap year.";
                } else {
                    isLeapYear=" is NOT a leap year.";
                }
            } else {
                isLeapYear=" is a leap year.";
            }
        } else {
            isLeapYear=" is NOT a leap year.";
        }
    }

    

    //get
    public String getLeapYear(){
        return isLeapYear;
    }

}
