package Chapter11;

public class ShapeTester {
    public static void main (String [] args)
    {
       // Shape rect = new Shape() ;  this gives a compilation error
        //reason being that Shape is just a template, can't be instantiated
        Shape rect = new Rectangle(5,7);
        rect.print();
        System.out.println(rect.calculateArea());
    }
}
