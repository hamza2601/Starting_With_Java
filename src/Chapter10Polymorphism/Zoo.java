package Chapter10Polymorphism;

public class Zoo {
    public static void main(String [] args)
    {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal Sasha = new Dog();
        Sasha.makeSound();// note here that even though Sasha has been instntiated as an animal
                          // she'll make a dog sound, b/c we specified that right afterwards
                          // THIS is polymorphism
        feed(Sasha); //Sasha will be fed dog food
        Sasha = new Cat();
        Sasha.makeSound(); // now Sasha will make the cat sound
        //Worth noting here that Sasha cannot access the purr function, b/c originall she's of animal type
        // She cannot excess Purr method, b/c that method is exclusive to the Cat class
        ((Cat)Sasha).purr(); // what we did here is called casting
        feed(Sasha); //now Sasha will be fed cat food, since we casted her to be a cat.

    }

    public static void feed( Animal animal)
    {
        if (animal instanceof  Dog)
        {
            System.out.println("Dog has been fed food");
        }
        else if (animal instanceof Cat)
        {
            System.out.println("Cat has been fed!");
        }
    }
}
