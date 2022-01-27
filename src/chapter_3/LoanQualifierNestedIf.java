package chapter_3;
import java.util.Scanner;

//Person must earn 30K , and also be working for two years.
public class LoanQualifierNestedIf {
    public static void main(String args[]){
        int min_salary= 30000;
        int min_experience = 2; //2 years
        Scanner S1 = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int actual_salary = S1.nextInt();
        System.out.println("Enter number of years of experience");
        double actual_years = S1.nextDouble();
        S1.close();
        if (actual_salary >= min_salary)
        {
            if(actual_years >= min_experience)
            {
                System.out.println("Congrats! You qualify for the loan");
            }
            else
            {
                System.out.println("Sorry! You meet the salary threshold, but lack the requisite work experience");
            }
        }
        else
        {
            System.out.println("Sorry! Your salary must be 30000 at minimum");
        }



    }
}
