package Chapter4;
import java.util.Scanner;
public class CashierProgramForLoop {
    public static void main(String args[])
    {
        System.out.println("Enter total number of items to be scanned");
        Scanner S1 = new Scanner(System.in);
        int quantity = S1.nextInt();
        double total = 0;
        for(int i = 0 ; i<quantity ; i++ )
        {
            System.out.println("Enter cost of the item");
            double price = S1.nextDouble();
            total = total + price;
        }
        System.out.println("Your cost is $" + total);

    }
}
