package Chapter8;

public class TextProcessor {
    public static void main (String [] args)
    {
        String T1 = "I love Pakistan! ";
        countWords(T1);
        String T2 = "Barrack";
        reverseString(T2);
        // now we're gonna develop a method, that inserts spaces between a jumbled up string,
        //separating them at the occurrence of a capital letter
        String T3 = "My Name is Hamza";
        addSpaces(T3);

    }

    /**
     * Splits a string into an array by tokenizing it
     * Counts words and prints them
     * @param Text Full string that is to be split
     */
    public static  void countWords(String Text)
    {
        var words = Text.split(" "); //The string split() method breaks a given string around matches of the given regular
                                                   // expression. After splitting against the given regular expression,
                                                    // this method returns a char array.
        int noOfWords = words.length;
        String message = String.format("Your text contains %d words:",noOfWords);
        System.out.println(message);

        for (int i =0; i<noOfWords ; i++)
        {
            System.out.println(words[i]);
        }
    }
    public static void reverseString( String t)
    {
        for (int i=t.length()-1; i>=0; i--)
        {
            System.out.print(t.charAt(i)); //we're using charAt, b/c t here is an object.

        }
        System.out.println(" ");

    }

    public static  void  addSpaces(String Text)
    {
        var modifiedText = new StringBuilder(Text); //The string split() method breaks a given string around matches of the given regular expression.
                                               // After splitting against the given regular expression, this method returns a char array.
                                               // Forgot to write Text in the brackets first. Be careful about that.
        for (int i =0; i<modifiedText.length(); i++)
        {
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i)))  //really weird syntax, but makes sense and works
            {
                modifiedText.insert(i, " ");
                i++;

            }

        }
        System.out.println(modifiedText);


    }


}
