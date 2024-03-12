     import java.util.Scanner;

public class calculateFactorial{
 public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter positive number");// ask user to enter positive number
     Integer positiveNumber = scanner.nextInt();
     Integer factorial;
     if (positiveNumber < 0) { // check if number is positive
         System.out.println("Please Enter Positive number");
     } else {
         factorial=factorialCalculation(positiveNumber); // call factorialCalculation function
         System.out.println("Factorial of " + positiveNumber + " is: " + factorial);
     }
 }
 //calculate factorial
     public static Integer factorialCalculation (int number) {

         if (number == 0) {
             return 1;
         }
         return number * factorialCalculation(number - 1);
         }

     }