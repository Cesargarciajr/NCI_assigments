import javax.swing.JOptionPane;

public class BloodyApp {
    public static void main(String[] args){
        //vars
        int age;
        int bloodType;
        String msg;

        //Object
        Bloody bloodyChecker = new Bloody();

        //input
        String[] options={"AB", "A", "B", "O"}; //Array with buttons options for JOptionPane
	    bloodType= JOptionPane.showOptionDialog(null, "Select your blood type:", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Insert your age: "));

        //set
        bloodyChecker.setAge(age);
        bloodyChecker.setBloodType(bloodType);

        //Compute
        bloodyChecker.checkAgeAndBloodType();

        //get
        msg = bloodyChecker.getMsg();

        //Output
        JOptionPane.showMessageDialog(null, msg);

    }
}
