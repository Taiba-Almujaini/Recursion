import java.util.Scanner;

public class CountDigit {
 public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter positive number");// ask user to enter positive number
     Integer positiveNumber = scanner.nextInt();
     Integer count;
     if (positiveNumber < 0) { // check if number is positive
         System.out.println("Please Enter Positive number");
     } else {
         count=digitCount(positiveNumber); // call recursiveDigitCount function
         System.out.println("Numbers of digit in " + positiveNumber + " is: " + count);
     }
 }
 //count the digit
     public static Integer digitCount( int number) {

         if (number == 0) {
             return 0;// if numer 0 mean it has 0 digit
         }
         return  1 + digitCount(number/10); //Dividing by 10 to extract digits from a number
         }

     }