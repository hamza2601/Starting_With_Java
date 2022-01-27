package chapter_3;
import java.util.Scanner;

public class GradeMessageSwitchCase {
    public static void main(String args[])
    {
        System.out.println("Enter your letter grade");
        Scanner S1 = new Scanner(System.in);
        String grade = S1.next();
        String message;

        switch(grade){
            case"A" :
                message = "Excellent job";
                break;
            case "B" :
                message = "Great job!";
                break;
            case "C" :
                message = "Satisfactory";
                break;
            case "D" :
                message = "You need to work hard";
                break;
            case "F" :
                message = "Oh no! You failed :( ";
                break;
            default:
                message = "Error! Invalid grade!";
                break;


        }
        System.out.println(message);

    }
}
