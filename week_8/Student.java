package week_8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //attributes
    private String collegeID;
    private String name;
    private int age;
    
    //constructor
    public Student(String ID,String nme,int agee)
    {
        this.collegeID= ID;
        this.name= nme;
        this.age= agee;
    }
    
    //setters and getters
    public void setCollegeID(String ID)
    {
        this.collegeID= ID;
    }
    
    public String getCollegeID()
    {
        return this.collegeID;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void display()
    {
        System.out.println("ID:"+this.getCollegeID());
        System.out.println("Name:"+this.getName());
        System.out.println("Age:"+this.getAge());
    }
    
    
    //behaviour or methods
    public void study()
    {
        System.out.println(name+" is studying");
    }
    public void laugh()
    {
        System.out.println(name+" is laughing");
    }
}