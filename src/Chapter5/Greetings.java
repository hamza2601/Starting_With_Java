package Chapter5;
import java.util.Scanner;


public class Greetings {
    public static void main(String args[]){
        System.out.println("Enter your name");
        Scanner S1 = new Scanner(System.in);
        String name = S1.next();
        greetUser(name);

    }
    public static void greetUser(String n)
    {
        System.out.println("Hi " + n);
    }

}
