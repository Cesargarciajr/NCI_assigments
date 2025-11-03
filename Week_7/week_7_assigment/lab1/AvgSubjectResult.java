import java.util.Scanner;
public class AvgSubjectResult{
    public static void main(String[] args){
        //declaring vars and arrays
        int numSubjects;
        double[] marks;
        double totalMarks=0;
        double avg;
        String[] grade;
        String overallGrade;

        //creating scanner object for user inputs
        Scanner scan = new Scanner(System.in);

        //getting from user number of sujects
        System.out.print("How many subjects do you take? ");
        numSubjects = scan.nextInt();

        // initialize the arrays based on number of subjects
        marks = new double[numSubjects];
        grade = new String[numSubjects];

        //collecting user inputs marks for each subject and storing in the array
        for(int i=0; i<numSubjects; i++){
            System.out.print("Enter mark for subject " + (i+1) + " (0-100): ");
            marks[i] = scan.nextDouble();
            totalMarks += marks[i];
        }

        // calculating overall avarage
        avg = totalMarks / numSubjects;

        //grading each subject based on the outputs stored in the array
        for (int i=0; i<numSubjects; i++){
            double m = marks[i];
            if (m >= 90) {
                grade[i] = "A";
            } else if (m >= 80) {
                grade[i] = "B";
            } else if (m >= 70) {
                grade[i] = "C";
            } else if (m >= 60) {
                grade[i] = "D";
            } else if (m >= 50) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }
        }

        // grading overall based on avg result
         if (avg >= 90) {
            overallGrade = "A";
        } else if (avg >= 80) {
            overallGrade = "B";
        } else if (avg >= 70) {
            overallGrade = "C";
        } else if (avg >= 60) {
            overallGrade = "D";
        } else if (avg >= 50) {
            overallGrade = "E";
        } else {
            overallGrade = "F";
        }

        // printing each subject and grade stored in the array
        for (int i=0; i<numSubjects; i++){
            System.out.println("Your grade for subject " + (i+1) + " is: " + grade[i]);
        }

        //printing overall avg and grade
        System.out.printf("\nYour overall avarage is: %.2f\n", avg);
        System.out.println("Your overall grade is: "+overallGrade);
        scan.close();
    }
}