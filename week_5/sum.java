package week_5;


/**
 * Write a description of class sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum
{
    public static void main(String[] args)
    {
        int i=1;
        int sum=0;
        do
        {
            sum+=i*i;
            i++;
        }
        while(i<=10);
        System.out.println("Sum of square of first 10 natural number:"+sum);
        
    }
}