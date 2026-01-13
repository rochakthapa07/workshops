package week_8;


/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    public static void main (String[] args)
    {
        employeeSalary emp= new employeeSalary(1000);
       System.out.println("Basic Salary: Rs. " + emp.getBasicSalary());
        System.out.println("Gross Salary: Rs. " + emp.calculateGrossSalary());
    }
}