/* Lab 1
Write a program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                          

- - - - - - - - - -                                                                                          

- - - - - - - - - -                                                                                           

- - - - - - - - - -                                                                                          

- - - - - - - - - -                                                                                           

- - - - - - - - - -                                                                                          

- - - - - - - - - -                                                                                           

- - - - - - - - - -                                                                                          

- - - - - - - - - -                                                                                          

- - - - - - - - - -  */

import java.util.Arrays;
public class grid {
    public static void main(String[] args){
        //vars declaring number of rows and columns
        int rows = 10;
        int columns = 10;

        //declaring array grid based on number of rows and columns
        String[][] grid = new String[rows][columns];

        //iteration through row length
        for(int row=0; row<grid.length; row++){

            //iteration through col length
            for(int col=0; col<grid[row].length; col++){
                
                //adding value to each row and column of the iteration
                grid[row][col] = "- ";
            }
        }

        //printing statement iterating through row and columns
        for(int row=0; row<10; row++){
            for(int col=0; col<10; col++){
                System.out.print(grid[row][col]);
            }

        //breaking line for each row 
        System.out.println();
        System.out.println();
        }
    }
}
