package Chapter13Correct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String [] args)
    {
        createNewFile();
        try {
            createNewFileRethrow(); //giving error b/c we didn't handle it
        } catch (Exception e)
        {
            System.out.println("Method threw an exception");
        }
    }

    public static void createNewFile()
    {
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("Directory doesn't exist");//specify exception you wanna catc
        }
    }

    public static void numbersExceptionHandling()
    {
        File file = new File("resources/nonexistent.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);

            while(fileReader.hasNext())
            {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }

        }catch( FileNotFoundException | InputMismatchException e)
        {
            e.printStackTrace(); // basically this makes our life easier. Bundling all the required exceptions to be caught together
        }finally{
            fileReader.close(); //can also put in in paraenthese after try
                                // try block will close it automatically
        }

        /*catch(FileNotFoundException e){
            e.printStackTrace();

        }catch(InputMismatchException e)
        {
            e.printStackTrace();   //we're trying to deal with the possibility of multiple exceptions here

        }catch(Exception e)
        {
            System.out.println("Exception!!"); // if we placed this at the first, we
                                               // we wouldn't have reached the other ones
        }*/
    }
     public static void createNewFileRethrow() throws IOException{   //we don't wanna handle the exception, just throw it back.
        File file = new File ("resources/nonexistent.txt");
        file.createNewFile();
     }

}
