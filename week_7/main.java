package week_7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        //Q1
        book b1= new book("Mahabharat","Vyasa",1000);
        book b2= new book("Prince","Machiavelli",800);

        System.out.println("Book 1 Details:");
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Price: " + b1.price);

        System.out.println();

        System.out.println("Book 2 Details:");
        System.out.println("Title: " + b2.title);
        System.out.println("Author: " + b2.author);
        System.out.println("Price: " + b2.price);
        
        //Q2
        Rectangle r1= new Rectangle(10,7);
        Rectangle r1= new Rectangle(9,8);
        System.out.println("Rectangle 1 Details:");
        System.out.println("Length: " + R1.length);
        System.out.println("Breadth: " + R1.breadth);
        System.out.println("Rectangle 2 Details:");
        System.out.println("Length: " + R2.length);
        System.out.println("Breadth: " + R2.breadth);
    }
}