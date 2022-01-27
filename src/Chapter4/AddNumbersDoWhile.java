package Chapter4;
import java.util.Scanner;
 //user should be able to keep adding numbers, UNTIL the inidcate that they are done.
public class AddNumbersDoWhile {
    public static void main(String args [])
    {
        Scanner S1 = new Scanner(System.in);
        boolean again = false;
        do{
            System.out.println("Enter first number:");
            double num1 = S1.nextDouble();
            System.out.println("Enter second number");
            double num2 = S1.nextDouble();
            double sum = num1 + num2;
            System.out.println("Sum = " + sum);
            System.out.println("Would you look to carry out this process again? : ");
            again = S1.nextBoolean();


        }while(again);
    }
}

