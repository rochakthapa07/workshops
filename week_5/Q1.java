package week_5;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[] args)
    {
        int i;
        //for loop
        System.out.println("for loop");
        for(i=1;i<=10;i++)
        {
            System.out.println(i*2);
        }
        //while loop
        System.out.println("while loop");
        i=1;
        while(i<=10)
        {
            System.out.println(i*2);
            i++;
        }
        //do while loop
        i=1;
        System.out.println("do while loop");
        do
        {
            System.out.println(i*2);
            i++;
        }
        while(i<=10);
    }
}