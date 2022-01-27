package Chapter6;
import java.util.Scanner;

//takinng objects as parameters

public class HomeAreaCalculatorRedo {
     private Scanner S1 = new Scanner(System.in);
    public static void main(String args[])
    {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double area = calculator.calcTotalArea(kitchen, bathroom);
        System.out.println("Total area is:" + area);


    }
    public Rectangle getRoom()
    {

        System.out.println("Enter the length of your room");
        double length = S1.nextDouble();
        System.out.println("Enter the width of your room");
        double width = S1.nextDouble();

       // Rectangle R1 = new Rectangle(length, width);
        // return R1;
        return new Rectangle(length, width); //this can also be done, instead of creating a new object and using so much space

    }
    public double calcTotalArea( Rectangle R1, Rectangle R2)
    {
        return R1.calculateArea() + R2.calculateArea();
    }
}
