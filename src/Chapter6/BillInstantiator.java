package Chapter6;

public class BillInstantiator {
    public static void main(String args[])
    {
        PhoneBillOOP Bill1 = new PhoneBillOOP("Hamza", 200, 150,175);
        double total = Bill1.totalCost();
        System.out.println("The total bill in this instant is: " + total);
        double tax = Bill1.tax();
        System.out.println("The tax for this bill is: " + tax);
        double overage = Bill1.overage();
        System.out.println("Overage for this bill = " + overage);

    }

}
