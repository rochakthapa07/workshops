package week_10;

/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class course
{
    private int courseId;
    private String courseName;
    private double baseFee;

    //constructors
    public course(int courseId,String courseName,double baseFee)
    {
        this.courseId= courseId;
        this.courseName= courseName;
        this.baseFee=baseFee;
    }

    public void setCourseId(int newId)
    {
        this.courseId=newId;
    }

    public int getCourseId()
    {
        return this.courseId;
    }
    
    public void setCourseName(String Cname)
    {
        this.courseName=Cname;
    }

    public String getCourseName()
    {
        return this.courseName;
    }
    
    public void setBaseFee(double Bfee)
    {
        this.baseFee=Bfee;
    }

    public double getBaseFee()
    {
        return this.baseFee;
    }
    
    private double calculateFee()
    {
        return this.baseFee;
    }
    
    public void displayCourse()
    {
        System.out.println("Course ID:"+ getCourseId());
        System.out.println("Course Name:"+ getCourseName());
    }
        

    
    
    
    
    
    
    
    
}