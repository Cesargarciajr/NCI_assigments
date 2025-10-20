import java.util.Scanner;
public class AvgSubjectResult{
    public static void main(String[] args){
        //vars
        int subjects;
        double marks;
        double totalMarks=0;
        double avg;
        String grade;

        //object
        Scanner scan = new Scanner(System.in);

        //inputs
        System.out.print("How many subjects do you take? ");
        subjects = scan.nextInt();

        for(int i=1; i<=subjects; i++){
            System.out.print("Enter mark for subject " + i + " (0-100): ");
            marks = scan.nextDouble();

            totalMarks += marks;
        }

        //output
        avg = totalMarks / subjects;
        System.out.printf("\nYour average mark is: %.2f\n", avg);

        //grades
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else if (avg >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Your grade: " + grade);




    }
}