package week_10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OflineCourse extends course
{
    private double labFee;
     
    public OflineCourse(int courseId,String courseName,double baseFee,double labFee)
    {
        super(courseId,courseName,baseFee);
        this.labFee=labFee;
    }
    
    protected double calculateFee()
    {
        return super.getBaseFee() + this.labFee;
    }
    
    public void displayOnlineCourse()
    {
        super.displayCourse();
        System.out.println("Total fee:"+ this.calculateFee());
    }
}
