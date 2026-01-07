package week_7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        // book objects
        book b1= new book("Mahabharat","Vyasa",1000);
        book b2= new book("Prince","Machiavelli",800);

        System.out.println("Book 1 Details:");
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Price: " + b1.price);

        System.out.println();

        System.out.println("Book 2 Details:");
        System.out.println("Title: " + b2.title);
        System.out.println("Author: " + b2.author);
        System.out.println("Price: " + b2.price);
        
        // rectangleobjects
        Rectangle R1= new Rectangle(10,7);
        Rectangle R2= new Rectangle(9,8);
        System.out.println("Rectangle 1 Details:");
        System.out.println("Length: " + R1.length);
        System.out.println("Breadth: " + R1.breadth);
        System.out.println("Area: " + (R1.length *R1.breadth));
        System.out.println("Rectangle 2 Details:");
        System.out.println("Length: " + R2.length);
        System.out.println("Breadth: " + R2.breadth);
        System.out.println("Area: " + (R2.length * R2.breadth));
        
        // employee objects
        Employee e1 = new Employee(101, "Ram", 35000);
        Employee e2 = new Employee(102, "Sita", 42000);
        Employee e3 = new Employee(103, "Hari", 38000);
        System.out.println("Employee Details:");
        System.out.println("ID\tName\tSalary");
        System.out.println(e1.id + "\t" + e1.name + "\t" + e1.salary);
        System.out.println(e2.id + "\t" + e2.name + "\t" + e2.salary);
        System.out.println(e3.id + "\t" + e3.name + "\t" + e3.salary);
        Employee highest = e1;
        if (e2.salary > highest.salary)
        {
             highest = e2;
        }
         if (e3.salary > highest.salary)
         {
             highest = e3;
         }
        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("ID: " + highest.id);
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: " + highest.salary);
        
        
        // laptop objects
        Laptop l1 = new Laptop("Dell", 8, 75000);
        Laptop l2 = new Laptop("HP", 16, 90000);
        Laptop l3 = new Laptop("Lenovo", 12, 85000);

        System.out.println("Laptops with RAM greater than 8GB:");
        System.out.println("Brand\tRAM\tPrice");

        if (l1.ram > 8) {
            System.out.println(l1.brand + "\t" + l1.ram + "\t" + l1.price);
        }

        if (l2.ram > 8) {
            System.out.println(l2.brand + "\t" + l2.ram + "\t" + l2.price);
        }

        if (l3.ram > 8) {
            System.out.println(l3.brand + "\t" + l3.ram + "\t" + l3.price);
        }
          
          
          
        // Mobile objects
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 18000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 120000;

        Mobile m3 = new Mobile();
        m3.brand = "Redmi";
        m3.price = 15000;
        Mobile[] mobiles = {m1, m2, m3};
        System.out.println("Affordable Mobiles (Price < 20000):");
        for (Mobile m : mobiles)
        {
             if (m.isAffordable())
             {
                 System.out.println(m.brand + " - Rs. " + m.price);
             }
        }
        
        
        // result objects
        Result a2 = new Result();
        a2.subject1 = 65;
        a2.subject2 = 70;
        a2.subject3 = 85;
        
        Result b2 = new Result();  
        b2.subject1 = 65;
        b2.subject2 = 70;
        b2.subject3 = 85;
        
        System.out.println("Result of Student 1:");
        a2.displayResult();
        System.out.println();
        System.out.println("Result of Student 2:");
        b2.displayResult();

          
         // Scenario objects
        BankAccount acc1 = new BankAccount(101, 5000);
        BankAccount acc2 = new BankAccount(102, 8000);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc2.deposit(1000);
        acc2.withdraw(3000);
        System.out.println("Final Account Balances:");
        acc1.displayBalance();
        acc2.displayBalance();
    }   
}