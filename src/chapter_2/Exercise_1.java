package chapter_2;

import java.util.Scanner;

public class Exercise_1 {

    public static void main( String[] args){

        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the season you prefer to drink coffee in: ");
        String season = S1.nextLine();
        System.out.println("Enter the number of cups of coffee that you prefer to drink: ");
        int cups = S1.nextInt();
        //String cup_num = cups.toString();
        System.out.println("Describe the type of day that you prefer for drinking coffee");
        String day_type = S1.nextLine();
        S1.close(); //we close the scanner here because we are done with it's usage.
        String str1 = "On a " + day_type + " " + season +" day, I drink a minimum of " + cups + " cups of coffee" ;
        System.out.println(str1);
    }








    //str1.concat(day_type);




}
