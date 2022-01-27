package chapter_3;
import java.util.Scanner;

public class TestResultsIfElseIf {
    public static void main(String args[]){
        System.out.println("Kindly enter your marks:");
        Scanner S1 = new Scanner(System.in);
        double score = S1.nextDouble();
        char grade;
        if (score < 60)
        {
            grade = 'f'; //single quaotation mark for char datatype
        }
        else if (score < 70)
        {
            grade = 'D';
        }
        else if (score < 80)
        {
            grade = 'C';
        }
        else if (score < 90)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }

        System.out.println("Your grade is = " + grade);

    }
}
