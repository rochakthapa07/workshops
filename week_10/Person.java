package week_10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int personId;
    private String personName;
    
    public Person(int personId,String personName)
    {
        this.personId=personId;
        this.personName=personName;
    }
    
    public void setPersonId(int newId)
    {
        this.personId=newId;
    }

    public int getPersonId()
    {
        return this.personId;
    }
    
    public void setPersonName(String name)
    {
        this.personName=name;
    }

    public String getPersonName()
    {
        return this.personName;
    }
    
    public double calculateSalary()
    {
        return 0.0;
    }
    
    @Override
    public String toString()
    {
       return "person id: " +this.getPersonId()+"person name: "+this.getPersonName(); 
    }
}