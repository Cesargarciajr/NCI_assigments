import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class EggsLaid {
    public static void main(String[] args){
        // A farmer has asked you to create an application that takes in a number of eggs that has been laid. The application should calculate and output how many 6-egg boxes the farmer needs to purchase to hold the eggs, and how many eggs will be left over.
        
        // Declaring variable, inputs and parsing integers.
        int laidEggs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs has been laid?"));
        int eggBox = 6;

        // Processing
        int totalBoxes = laidEggs / eggBox;
        int leftOverEggs = laidEggs % eggBox;
    
        //Outputs
        JOptionPane.showMessageDialog(null, "Amount of boxes needed: " + totalBoxes);
        JOptionPane.showMessageDialog(null, "Amount of eggs left over: " + leftOverEggs);
    }
}