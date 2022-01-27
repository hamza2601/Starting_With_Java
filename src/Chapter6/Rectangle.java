package Chapter6;

public class Rectangle {
    private double length;
    private double width; //these are fields

    //encapsulation is a very good practice. This is what are getters setters and constructors are for
    //This is why getters and setters must be made public

    public Rectangle()
    {
        length = width = 0;
    }

    public Rectangle(double l, double w)  //using contructor with argument list, in case user wants to enter value
    {
        this.length = l;
        this.width = w;
        //getter setter methods can be used in this function as well, for the same purpose.

    }


   public double getLength()
    {
      return length;
    }
   public void setLength(double l)
    {
        this.length = l;
    }
    public double getWidth()
    {
        return width;
    }
   public void setWidth(double w)
    {
        this.width = w;
    }
     //apart from getters and setters, contructors can also be used for getting values of attributes


    public double calculatePerimeter()
    {
        return ((2*length) + (2*width));
    }
    public double calculateArea()
    {
        return(length * width);
    }

}
