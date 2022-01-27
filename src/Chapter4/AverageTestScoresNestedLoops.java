package Chapter4;
import java.util.Scanner;

public class AverageTestScoresNestedLoops {
    public static void main(String args []){
        int noStudents= 24;
        int noOfTests = 4;
        Scanner S1 = new Scanner(System.in);

        for(int i =0 ; i<noStudents; i++)
        {
            double total = 0;
            for(int j= 0; j<noOfTests ; j++)
            {
                System.out.println("Enter score for test no." + (j+1));
                double score = S1.nextDouble();
                total = total + score;

            }
            double average = total/noOfTests;
            System.out.println("The test average for student " + (i+1) + " is " + average);
        }
        S1.close();

    }
}
