// Bianca Aguirre
// March 10, 2015
// HW#1

//import appropriate classes
import java.util.*;

public class ShowInterestShell {
    public static void main(String[] args) {
	      //ask the required info from the user 
			Scanner console = new Scanner(System.in);
         
         System.out.println("How many time do you want to run the program?");
         int times = console.nextInt();
         
         for(int i = 1; i <= times; i++) {
         
         System.out.println("Enter your name:");
         String first = console.next();
         System.out.println("Enter your last name:");
         String last = console.next();
         System.out.println("Enter the initial deposit:");
         double amount = console.nextDouble();
         System.out.println("Enter the number of years you want to calculate the interest:");
         int periods = console.nextInt();
         System.out.println("Enter the annual interest rate:");
         double rate = console.nextDouble();
         System.out.println("Enter the amount of your monthly deposit:");
         double deposit = console.nextDouble();
         
         
         
         //call printTable method for eachset of info
         printTable(amount, periods, rate, deposit);
         
         System.out.println();
         for(int j = 1; j <=31; j++) {
            System.out.print("*");
         }		  	  
         System.out.println();
         System.out.println();
			}  
    }
	//the method calculates the interest and uses the new interest to calulate for the new balance
	public static void printTable(double amount, int periods, double rate, double deposit) {
      System.out.println("Year\tInterest Deposit New Balance");
      System.out.println("Start\t\t\t" + amount);
         
      for(int i = 1; i <= periods; i++) {
         double interest = Math.round((rate / 100) * amount);
         amount = amount + interest + deposit;
         System.out.println(i + "\t" + interest + "\t" + deposit + "\t" + amount);
      }
           	      
   }

}