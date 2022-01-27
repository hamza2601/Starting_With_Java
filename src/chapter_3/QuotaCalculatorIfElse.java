package chapter_3;


/* All people are expected to make ten sales each week
 Those who are successful receive a congragulatory message.
 Those who do not, they are informed that by how many sales were they short.
 */

import java.util.Scanner;

public class QuotaCalculatorIfElse {
    public static void main(String args[]){
        int quota = 10;
        System.out.println("Enter number of sales made this week");
        Scanner SC = new Scanner(System.in);
        int sales = SC.nextInt();
        SC.close();
        //Now make a decision
        if(sales >= quota)
        {
            System.out.println("Hurray! You met your quota!!");
        }
        else{
            int shortage = quota - sales;
            System.out.println("You fell behind target by " + shortage + " sale(s)");
        }
    }
}
