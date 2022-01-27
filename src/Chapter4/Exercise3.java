package Chapter4;

import java.util.Random;

public class Exercise3 {
    public static void main (String args[])
    {
        int max = 20;
        int total = 0;
        for(int i =0 ; i<5 ; i++) {

                Random random = new Random();
                int die = random.nextInt(6) + 1;
                System.out.println(die);
                total = total + die;
                System.out.println("This is roll #" + (i + 1));
                System.out.println("You've rolled a " + die );
                if (total == max) {
                    System.out.println("Congrats!! You win!");
                    break;
                }
                else if (total > max)
                {
                    System.out.println("Sorry, you've gotten" + total + "and exceeded by" + (total-max));
                    break;
                }
                else if (total < max)
                {
                    System.out.println("You have" + (max - total) + "more to go");
                }
            }
        }

    }

