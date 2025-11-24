import java.util.Scanner;
public class avgGrade {
    public static void main(String[] args){
        //arrays
        double[][] results = new double[4][5];
        double[] totalYearly = new double[4];
        double[] avgYearly = new double[4];

        //vars
        double totalYearlyAvg=0;
        double totalAvg=0;

        //object
        Scanner scan = new Scanner(System.in);

        //iterating through results and year
        for(int year=0; year<results.length; year++){
            for(int res=0; res<results[year].length; res++){
            System.out.print("Enter your result of the year "+(year+1)+", for the "+(res+1)+" subject:");
            results[year][res] = scan.nextDouble();
            }
            System.out.println();
        }
        
        //iteration to calculate avg per year 
        for(int year=0; year<results.length; year++){
            for(int res=0; res<results[year].length; res++){
                totalYearly[year] += results[year][res];
            }
            avgYearly[year] = totalYearly[year] / results[year].length;
            totalYearlyAvg += avgYearly[year];
        }
        totalAvg = totalYearlyAvg / results.length;
        

        //printing statement
        for(int i=0; i<totalYearly.length; i++){
            System.out.print("Your avarage for the year "+(i+1)+" is: "+avgYearly[i]);
            System.out.println();
        }
        System.out.printf("\nYour Total Avarage is: %.2f", totalAvg);
    }
}
