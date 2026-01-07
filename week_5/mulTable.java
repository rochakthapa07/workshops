package week_5;
import java.util.Scanner;


/**
 * Write a description of class mulTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mulTable
{
    public static void main(String[] args)
    {
        Scanner mul=new Scanner(System.in);
        System.out.println("Enter a number:");
        float num=mul.nextFloat();
        for(int i=1;i<=10;i++)
        {
            float result=num*i;
            System.out.println(num+ "*" +i+ "="+result);
        }
        
    }
}