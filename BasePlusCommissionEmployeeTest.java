//Name: Evan Eggerud, Ashling Cruz
//Source: Deitel & Deitel
//Class: CS 145 
//Assignment: Employee Superclass Project
//Purpose: This test class asks for user input and builds on the inherited classes to creat a user profile which is printed
import java.util.Scanner;



public class BasePlusCommissionEmployeeTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.nextLine();
        System.out.println("Enter your last name:");
        String lastName = input.nextLine();
        System.out.println("Enter your SSN (XXX-XX-XXXX):");
        String socialSecurityNumber = input.nextLine();
        System.out.println("Enter your weekly sales:");
        double grossWeeklySales = input.nextDouble();
        System.out.println("Enter your commission rate (must be between 0 and 1):");
        double commissionRate = input.nextDouble();
        System.out.println("Enter your base salary:");
        double baseSalary = input.nextDouble();
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, grossWeeklySales, commissionRate, baseSalary);
        
        System.out.println("Employee information:");
        System.out.println(employee);
        System.out.println("Gross earnings: " + employee.earnings());
        
        
        
        input.close();

    }   

}