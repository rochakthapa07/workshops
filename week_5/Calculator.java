package week_5;
import java.util.Scanner;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);
        char choice='y';

        while(choice=='y'||choice=='Y') {
            System.out.print("Enter first number: ");
            float n1=cal.nextFloat();
            System.out.print("Enter second number: ");
            float n2=cal.nextFloat();
            System.out.print("Choose operation (+,-,*,/): ");
            char op=cal.next().charAt(0);
            float result=0;

            switch(op) {
                case '+':
                    result=n1+n2;
                    System.out.println("Sum: "+result);
                    break;
                case '-':
                    result=n1-n2;
                    System.out.println("Subraction: "+result);
                    break;
                case '*':
                    result=n1*n2;
                    System.out.println("Multiplication: "+result);
                    break;
                case '/':
                    if(n2!=0)
                        System.out.println("Division: "+(n1/n2));
                    else
                        System.out.println("Error: Division by zero!");
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            System.out.print("Do you want to perform another operation? (y/n): ");
            choice=cal.next().charAt(0);
            System.out.println();
        }
        System.out.println("Calculator exited!");
    }
}

