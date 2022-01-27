package Chapter7;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner S1 = new Scanner(System.in);
    public static void main (String[] args)
    {
        System.out.println("How many grades would you like to enter?");
        grades = new int [S1.nextInt()]; // very very useful feature in Java, the ability to dynamically set an array's size, something missing in C++
        getGrades();
        System.out.println("Average:" + average()); // basically the weird green thingy is saying only return two decimal places for number in question

        System.out.println("Highest: " + getHightest());
        System.out.println("Lowest: " + getLowest());

    }
    public static void getGrades()
    {
        for (int i =0; i<grades.length ; i++)
        {
            System.out.println("Enter grade #" + (i+1));
            grades[i] = S1.nextInt();
        }

    }
    public static  int calcSum()
    {
        int sum =  0;
        for(int grade: grades)
        {
            sum = sum + grade;
        }
        return sum;
    }
    public static  int average()
    {
        return calcSum()/grades.length;
    }
    public static int getHightest()
    {
        int highest = grades[0];
        for (int grade : grades)
        {
            if (grade > highest)
                highest = grade;
        }
        return highest;   //this enhanced loop feature in Java is pretty convenient ngl
    }
    public static int getLowest()
    {
        int lowest = grades[0];
        for (int grade : grades)
        {
            if (grade < lowest)
                lowest = grade;
        }
        return lowest;   //love this refactor feature!! So convenient
    }


}
