import java.util.Scanner;

public class NaturalNumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number");// ask user to enter positive number
        Integer positiveNumber = scanner.nextInt();
        Integer sumOfNaturalNumber;
        if (positiveNumber < 0) { // check if number is positive
            System.out.println("Please Enter Positive number");
        } else {
            sumOfNaturalNumber=sumOfNumbers(positiveNumber); // call sumOfNumbers function
            System.out.println("sum of natural number is " + sumOfNaturalNumber);
        }
    }
    //count the digit
    public static Integer sumOfNumbers( int number) {

        if (number == 0) {
            return 0;// if numer 0 mean it has 0 digit
        }
        return  number + sumOfNumbers(number-1);// Add the current number to the sum of the previous natural numbers
    }

}
