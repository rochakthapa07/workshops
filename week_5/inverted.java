package week_5;


/**
 * Write a description of class triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class inverted
{
    public static void main(String[] args)
    {
      for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }  
    }
}