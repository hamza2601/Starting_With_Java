package Chapter13;
//this was meant to be chapter 12, named it 13 by mistake

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import static javax.swing.UIManager.put;

public class CollectionTesting {
    public static  void main (String [] args)
    {
        Queue <String> fruit = new LinkedList();  // with the diamond bracket thing, we've specified that queue will hold strings
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Lemon");

        System.out.println(fruit.size());
        System.out.println(fruit.peek());
        //map interfaces unique keys to values

        Map <String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon" , 20);
        System.out.println(fruitCalories.get("lemon"));

        //using List.of makes the collection immutable, i.e. nothing can be added or removed

        //collections can be looped through, by using iterators
        var i =fruit.iterator();
        while(i.hasNext())  //.hasNext is a pretty cool boolean which tells that the list has remaining elements
        {
            System.out.println(i.next());

        }
        for(String item: fruit)
        {
            System.out.println(item);
        }
        fruit.forEach(x -> System.out.println(x)); //give generic name to each item

        //all of the three implementations above do the same job, i.e. output contents

        System.out.println("Testing for loop now....");

        for (var entry: fruitCalories.entrySet())
        {
            System.out.println(entry.getValue());
        }

        System.out.println("Now we try using the forEach method");

        fruitCalories.forEach(
                (k,v)-> System.out.println("Fruit: "+ k +", Calories: "+v)       );




    }
}
