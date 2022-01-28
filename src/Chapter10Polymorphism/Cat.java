package Chapter10Polymorphism;

public class Cat extends Animal{
    @Override
    public void  makeSound()
    {
        System.out.println("Meow Meow!!");
    }
    public void purr()
    {
        System.out.println("Cats purr when they are comfortable");
    }

}
