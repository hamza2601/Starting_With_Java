package chapter_3;
/*
ALl sales people get a payment of 1000USD
Those who exceed 10 sales get a bonus of 250USD
 */
import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String args[]){
        //initialize known values
        int salary = 1000;
        int bonus = 250;
        //get values for what is not known
        System.out.println("Enter number of sales made by employee: ");
        Scanner S1 = new Scanner(System.in);
        int sales = S1.nextInt();
        S1.close();
        //quick detour to identify bonus earners
        if (sales > 10)
        {
            salary = salary + bonus;
        }
        System.out.println("The employee's pay is USD " + salary);
    }
}
