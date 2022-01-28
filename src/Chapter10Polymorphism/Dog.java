package Chapter10Polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound()
    {
        System.out.println("Waao Waao!!");
    }
    public void fetch()
    {
        System.out.println("I got the ball!!");
    }

}
