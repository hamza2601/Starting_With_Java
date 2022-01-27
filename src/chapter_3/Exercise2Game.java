package chapter_3;
import java.util.Scanner;
public class Exercise2Game {
    public static void main(String args[])
    {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter number of pennies: ");
        int pennies = S1.nextInt();
        System.out.println("Enter number of nickels:");
        int nickels = S1.nextInt();
        System.out.println("Enter number of dimes");
        int dimes = S1.nextInt();
        System.out.println("Enter number of quarters");
        int quarters = S1.nextInt();
        S1.close();
        nickels = nickels * 5;
        dimes = dimes * 10;
        quarters = quarters * 25;
        int total = pennies + nickels + dimes + quarters;
        if (total == 100)
        {
            System.out.println("Congrats! You won the game!!");
        }
        else if (total < 100)
        {
            int shortage = 100 - total;
            System.out.println("Sorry! You fell short by " + shortage + "pennies!");


        }
        else if (total > 100)
        {
            int excess = total - 100;
            System.out.println("Sorry! You exceeded by " + excess + " pennies");
        }
    }
}
