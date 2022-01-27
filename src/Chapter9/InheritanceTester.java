package Chapter9;

public class InheritanceTester {
    public static void main(String[] args)
    {
        //Person person = new Person();
        Employee E1 = new Employee();  //Really interesting thing......
                                       //Notice when this contructor is called, not only Employee's constructor message is displayed
                                       //but person class's constructor message is displayed before that
        //notice that when you type E1. a menu drops down
        //not only do you get the getters and setters for the attributes of employee class in that drop down menu
        //rather we also find that attributes of person class.
        Rectangle R1 = new Rectangle();
        Square S1 = new Square();
        //notice when you type S1.print, you get options for two methods, unlike in case of rectangle.
        //This is called method overloading
        Mother Amma = new Mother();
        Amma.setName("Sumaira"); //notice we can access this getter, even though it wasn't defined in the mother class
        System.out.println(Amma.getName() + "is a " + Amma.getGender());





    }
}
