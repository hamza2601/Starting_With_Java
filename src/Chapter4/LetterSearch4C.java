package Chapter4;
import java.util.Scanner;

public class LetterSearch4C {
    public static void main(String args[])
    {
        System.out.println("Enter some text :");
        Scanner S1 = new Scanner(System.in);
        String text = S1.nextLine();
        S1.close();
        int l = text.length();
        boolean letterfound = false;
        for (int i = 0; i<l ; i++)
        {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a')
            {
                letterfound = true;
                break;

            }
        }
        if (letterfound)
        {
            System.out.println("The text contains letter 'A");
        }
        else
        {
            System.out.println("Sorry! Desired letter could not be found");

        }

    }

}
