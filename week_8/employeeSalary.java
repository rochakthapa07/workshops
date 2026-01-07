package week_8;


/**
 * Write a description of class employeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employeeSalary
{
    private double basicSalary;
    
    //constructor
    public employeeSalary(double bSal)
    {
        this.basicSalary= bSal;
    }
    
    //setters and getters
    public void setBasicSalary(double bSal)
    {
        this.basicSalary=bSal;
    }    
    
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
    
    public double calculateGrossSalary()
    {
        double bonus=0.20*this.basicSalary;
        return this.basicSalary + bonus;
    }
     
    public void displayinfo()
    {
        System.out.println("Basic salary:"+this.getBasicSalary());
        double grossSalary=calculateGrossSalary();
        System.out.println("Basic salary:"+ grossSalary);
    }
}