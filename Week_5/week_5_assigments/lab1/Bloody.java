public class Bloody {
    //vars
    private int age;
    private int bloodType;
    private String msg;

    //set
    public void setAge(int age){
        this.age=age;
    }

    public void setBloodType(int bloodType){
        this.bloodType=bloodType;
    }

    //Process
    public void checkAgeAndBloodType(){
        if(age>=18){
            if(bloodType == 0){
                msg="You can donate blood to AB and receive from AB, A, B, O blood types.";
            } else if(bloodType == 1){
                msg="You can donate blood to A and AB. And receive from A and O blood types.";
            } else if(bloodType == 2){
                msg="You can donate blood to B and AB. And receive from B and O blood types.";
            } else {
                msg="You can donate blood to AB, A, B and O. And receive from O blood type.";
            }
        }
        else{
            msg="Sorry, you're too young to donate blood.";
        }
    }

    //get
    public String getMsg(){
        return msg;
    }
}
