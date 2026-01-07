package week_8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String accountNumber;
    private long balance; 
    private String name;    
    
    //constructor
    public BankAccount(String acN,long balance,String Name)
    {
        this.accountNumber=acN;
        this.balance=balance;
        this.name=name;
    }
    
    //setters and getters
    public void setAccountNumber(String acN)
    {
        this.accountNumber=acN;
    }
    public String getAccountNumber()
    {
        
    }
    public void setAccountNumber(long balance)
    {
        this.balance=balance;
    }
    
    public void setAccountNumber(String nme)
    {
        this.name=nme;
    }
}
}

}