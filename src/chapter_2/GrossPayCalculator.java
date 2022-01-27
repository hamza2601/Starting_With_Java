package chapter_2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg []){
        //Use two slashes to comment, just like C++
        //Firstly, get numbers of hours worked
        System.out.println("Enter number of hours the employed clocked in ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt(); //next depends on datatype being utilized
        //get hourly pay rate
        System.out.println(" Enter employee's pay rate");
        double pay_rate = scanner.nextDouble(); //since hourly rate is in decimals
        scanner.close(); //necessary to close scanner to preserve memory
        //multiply hours and pay rate
        double gross_pay = hours * pay_rate;
        //display result
        System.out.println(" Gross pay = " + gross_pay);





    }
}
