package Chapter11;

public class Customer {
    public static void main(String[] args)
    {
        Product B1 = new Book();
        B1.setName("In the Line of Fire");
        ((Book)B1).setAuthor("Pervez Musharraf");

    }

}
