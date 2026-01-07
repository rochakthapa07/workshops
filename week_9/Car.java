package week_9;


public class Car extends Vehicle
{
    private int doors;
    private String fuelType;
    
    public Car(int vehicleID,String brand,double BasePrice,int doors,String fuelType)
    {
        super(vehicleID,brand,BasePrice);
        this.doors=doors;
        this.fuelType=fuelType;
    }
    public double calculateFinalPrice()
    {
        return super.BasePrice + super.calculateTax() +0.05 * super.BasePrice;
    }
    
    public void displayCarDetails()
    {
        super.dispalyInfo();
        Syptem.out.println("doors:"+this.doors);
        Syptem.out.println("Fueltype:"+this.fuelType);
    }
}