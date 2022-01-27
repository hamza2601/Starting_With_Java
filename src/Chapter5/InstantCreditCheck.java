package Chapter5;
import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000; //class variables
    static int requiredCreditScore = 700;
    public static void main ( String args[])
    {
     double salary =getSalary(); // salary is a local variable
     int creditScore = getCreditScore();
     boolean qualification = isQualified(creditScore, salary);
     notifyUser(qualification);



    }

    public static double getSalary()
    {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = S1.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        Scanner S2 = new Scanner(System.in);
        System.out.println("Enter your credit score");
        int creditScore = S2.nextInt();
        return  creditScore;
    }
    public static boolean isQualified (int c_Score, double salary)
    {
        if(c_Score >= requiredCreditScore && salary >= requiredSalary)
        {
            return true;

        }
        else
            return false;
    }
    public static void notifyUser(boolean qualified)
    {
        if (qualified)
        {
            System.out.println("Congrats! You qualified for the loan!");

        }
        else
        {
            System.out.println("Sorry! You couldn't qualify");
        }
    }


}
