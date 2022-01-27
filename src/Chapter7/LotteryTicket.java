package Chapter7;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//array element can be set or accessed by using index.
// int[] lottoTicket = {1,13,34,56,74,90} , now here we didn't need to spe4cify the array length. It was understood automatically.

public class LotteryTicket {
    public static  int LENGTH =6; //variable name in all caps, to indicate it's a constant
    public static void main (String[] args )
    {
        int [] ticket = generateNumbers();
        Arrays.sort(ticket); //just sorting it for better readability
        printTicket(ticket);

    }
    public static int[] generateNumbers()
    {
        int [] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i =0; i<LENGTH; i++)
        {
            int randomNumber;
            do {
                randomNumber = random.nextInt(69) +1; // b/c we need b/w 1 and 69, hence adding 1;
            }while(Search(ticket, randomNumber));

            ticket[i] = random.nextInt(69) +1; // b/c we need b/w 1 and 69, hence adding 1

        }
        return ticket;

    }

    /**
     * Does a sequential search on arrray to find a value
     * @param array The array which will be searched through
     * @param number number to be searcehd for
     * @return will return true if number is found, false if it isn't
     */
    public static boolean Search(int [] array, int number)
    {
        //This is called enhanced loop
        //Will iterate through a loop, and assign the current element to the specified variable
        for (int value : array)
        {
            if (value == number)
            {
                return true;
            }
        }
            return false;

    }
    public static  void printTicket(int ticket[])
    {
        for(int i =0; i< LENGTH; i++)
        {
            System.out.print(ticket[i] + " ");
        }
    }
    public static boolean binarySearch(int [] array, int numberToSearch)
    {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearch); //NOTE: This binary f/n is a built in feature of the Arrays class
        if (index >=0)
        {
            return true;
        }
        else return  false;

    }

}
