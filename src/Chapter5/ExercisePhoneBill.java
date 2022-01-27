package Chapter5;
import java.util.Scanner;

public class ExercisePhoneBill {

    public static void main(String args [])
    {
        double fee = getFee();
        double overage = getOverage();
        double tax = tax(fee);
        double overageFee = overFee(overage);
        double total = finalTotal(fee, tax, overageFee);
        System.out.println("Final total is =" + total);

    }
    static double getFee()
    {
        System.out.println("Please enter fee");
        Scanner S1 = new Scanner(System.in);
        double  fee = S1.nextDouble();
        return fee;
    }
    static double getOverage()
    {
        System.out.println("Please enter overage:");
        Scanner S2 = new Scanner(System.in);
        double overage = S2.nextDouble();
        return overage;
    }
    static double tax(double subTotal)
    {
        double tax = subTotal * 0.15;
        return tax;
    }
    static double overFee(double overage)
    {
        double overfee = overage * 0.25;
        return overfee;
    }
    static double finalTotal(double fee, double tax, double overage)
    {
        double total = fee + tax + overage;
        return total;
    }




}
