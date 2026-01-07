package week_9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int vehicleID;
    protected String brand;
    protected double BasePrice;
    
    public Vehicle(int ID,String brand,double BasePrice)
    {
        this.vehicleID=ID;
        this.brand=brand;
        this.BasePrice=BasePrice;
    }
    
    public double calculateTax()
    {
        double tax=0.1*this.BasePrice;
        return this.BasePrice+tax;
    }
    
    public void displayInfo()
    {
        System.out.println("VehicleID:"+this.vehicleID);
        System.out.println("Brand:"+this.brand);
        System.out.println("BasePrice:"+this.BasePrice);
    }
    
    
    

}