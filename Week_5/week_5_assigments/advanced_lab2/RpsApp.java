import javax.swing.JOptionPane;
public class RpsApp{
    public static void main(String[] args){
        //vars
        int userInput;
        int computerInput;
        String resultMsg;
        //object
        Rps play = new Rps();

        //input
        for(int i=0; i<3; i++){ //loop counts until 3 rounds
            String[] options={"🪨", "📄", "✂️"}; //Array with buttons options for JOptionPane
            String title = "Round: "+(i+1)+" out of 3";
            userInput= JOptionPane.showOptionDialog(
                null, 
                "Choose one of the options!",
                title, 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]);

            computerInput=(int)(Math.random() * 3);
            
            //set
            play.setUserInput(userInput);
            play.setComputerInput(computerInput);

            //compute
            play.compareResult();

            //get
            resultMsg = play.getResult();

            //output
            JOptionPane.showMessageDialog(null, resultMsg);
        }
    }
}
