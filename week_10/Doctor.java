package week_10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialization;
    private int consultationFee;
    
    public Doctor(int personId,String personName,String specialization,int consultationFee)
    {
        super(personId,personName);
        this.specialization=specialization;
        this.consultationFee=consultationFee;
    }
    
    @Override
    public double calculateSalary()
    {
        double base=super.calculateSalary();
        double finalSalary=base + (consultationFee * 30);
        return finalSalary;
    }
    
    public double calculateSalary(int emergencyCases)
    {
        double normalSalary= this.calculateSalary();
        double perEmergencyCharge=500;
        double emergencyBonus=emergencyCases * perEmergencyCharge;
        return normalSalary + emergencyBonus;
    }
    
    @Override
    public String toString()
    {
        return  super.toString()+"specialization: " +this.specialization+"person name: "+this.consultationFee; 
    }
    
    
}