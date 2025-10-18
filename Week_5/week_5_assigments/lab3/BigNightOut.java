public class BigNightOut {
    //vars
    private int year;
    private String progCode;
    private String venue;

    //set
    public void setYear(int year){
        this.year=year;
    }

    public void setProgCode(String progCode){
        this.progCode=progCode;
    }

    //Compute
    public void findVenue(){
        if(year==1){
            if(progCode.equalsIgnoreCase("HDBC")){
                venue="Your venue is Harbourmaster";
            } else if(progCode.equalsIgnoreCase("HDAIML")){
                venue="Your venue is Lagoona";
            } else {
                venue="Your Programme Code is Invalid";
            }
        } else if (year==2 && progCode.equalsIgnoreCase("HDAIML")){
            venue="Your venue is Harbourmaster";
        } else if (year==2 && progCode.equalsIgnoreCase("HDBC")){
            venue="Your venue is Lagoona";
        } else {
            venue="Your Programme Code is Invalid";
        }
    }

    //get
    public String getVenue(){
        return venue;
    }
}
