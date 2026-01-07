package week_10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineCourse extends course
{
    private double platformFee;
     
    public OnlineCourse(int courseId,String courseName,double baseFee,double platformFee)
    {
        super(courseId,courseName,baseFee);
        this.platformFee=platformFee;
    }
    
    //overide
    protected double calculateFee()
    {
        return super.getBaseFee() + this.platformFee;
    }
    
    public void displayOnlineCourse()
    {
        super.displayCourse();
        System.out.println("Total fee:"+this.calculateFee());
    }
}
