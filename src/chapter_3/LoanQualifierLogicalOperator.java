package chapter_3;


import java.util.Scanner;

public class LoanQualifierLogicalOperator {
    public static void main(String args[]){
        int min_salary= 30000;
        int min_experience = 2; //2 years
        Scanner S1 = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int actual_salary = S1.nextInt();
        System.out.println("Enter number of years of experience");
        double actual_years = S1.nextDouble();
        S1.close();
        if (actual_salary >= min_salary && actual_years >= min_experience)
        {
            System.out.println("Congrats!! You're eligible for the loan");
        }
        else
        {
            System.out.println("Sorry! You failed to qualify for the loan! :(");
        }




    }
}
