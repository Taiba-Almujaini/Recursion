import java.util.Scanner;

public class FibonacciSequence {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number");// ask user to enter positive number
        Integer positiveNumber = scanner.nextInt();
        if (positiveNumber < 0) { // check if number is positive
            System.out.println("Please Enter Positive number");
        } else {
            System.out.println("Fibonacci sequence up to " + positiveNumber + ":");
            for (int i = 0; i <= positiveNumber; i++) { // // Loop to print each Fibonacci number
                System.out.print(fibonacci(i) + " ");// call  Recursive method to print Fibonacci sequence
            }
        }
    }
     // Recursive method to calculate the nth Fibonacci number
    public static Integer fibonacci( int number) {

        if (number <= 1)
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2); // Calculate Fibonacci number by summing the previous two Fibonacci numbers
    }

}
