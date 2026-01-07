package week_5;
import java.util.Scanner;


/**
 * Write a description of class mulTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverse
{
    public static void main(String[] args)
    {
        Scanner reverse=new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num=reverse.nextInt();
        int rev=0;
        while(num!=0) 
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reversed number: " + rev);
    }
}