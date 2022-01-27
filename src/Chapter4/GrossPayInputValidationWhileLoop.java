package Chapter4;
import java.util.Scanner;

public class GrossPayInputValidationWhileLoop {
    public static void main(String args[])
    {
          int rate = 15; //in USD
          int max_hours = 40; //limit upto which employee can work upto in a week
          System.out.println("Enter number of hours that you worked this week: ");
          Scanner S1 = new Scanner(System.in);
          double hoursWorked = S1.nextDouble();

          //validating input
        while( hoursWorked > max_hours || hoursWorked < 1)
        {
            System.out.println("Invalid entry! Your hours must be in between 1 and 40;");
            hoursWorked = S1.nextDouble(); //giving user another chance to enter the correct value
            //necessary to update a variable in the loop, so it does not keep reiterating infinitely
            //such a variable is called a sentinnel.
        }
        S1.close();
        double gross = hoursWorked * rate;
        System.out.println("Gross total pay = " + gross);

    }
}
