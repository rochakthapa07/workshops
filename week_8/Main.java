package week_8;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        //object creation
        Student s1=new Student("np01","Rochak",18);
        s1.display();
        s1.setCollegeID("np02");
        s1.setName("Thapa");
        s1.setAge(19);
        s1.display();
    }
}