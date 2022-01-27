package Chapter6;
import java.util.Scanner;

public class HomeAreaCalculator {
    public static  void main (String args[])
    {
        //Rectangle 1
        Rectangle Room1 = new Rectangle();
        Room1.setLength(15);
        Room1.setWidth(10);
        double areaR1 = Room1.calculateArea();
        //Rectangle 2
        Rectangle Room2 = new Rectangle(25, 17);
        double areaR2 = Room2.calculateArea();
        double totalArea = areaR1 + areaR2;
        System.out.println("Area of the whole house is: " + totalArea);
        //this is an example of a specific instantiation and implememntation of a general blueprint i.e. a class.

    }

}
