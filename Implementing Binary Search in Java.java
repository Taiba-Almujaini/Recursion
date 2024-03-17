
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array :");// ask user to enter array length
        Integer arrayLength = scanner.nextInt();

        // Check if array length is valid
        if (arrayLength <= 0) {
            System.out.println("Invalid input. Array length must be greater than zero.");
            return;
        }
        Integer[] numberArray = new Integer[arrayLength];
        System.out.println("Enter the elements of array in ascending order:");
        for (int i = 0; i < arrayLength; i++) {
            numberArray[i] = scanner.nextInt();
            if (numberArray[i] < 0) { // check if integer is positive or not
                System.out.println("Invalid input. Please enter positive integers.");
                return;
            }
        }
        if (!Ascending(numberArray)) { // check if the element is in ascending order or not
            System.out.println("Invalid input. Array elements must be in ascending order.");
            return;
        }


        System.out.print("Enter the target value to search for: "); // ask the user to enter the number to be searched
        Integer target = scanner.nextInt();


        // Perform binary search
        Integer startIndex = 0;
        Integer endIndex = numberArray.length - 1;
        while (startIndex <= endIndex) {
            Integer midIndex = startIndex + (endIndex - startIndex) / 2;

            // Check if target is present at mid
            if (numberArray[midIndex] == target) {
                System.out.println("Output: " + midIndex);
                System.out.println(" The target value " + target + " is found at index " + midIndex + ".");
                return;
            }

            // If target greater, ignore left half
            if (numberArray[midIndex] < target)
                startIndex = midIndex + 1;
                // If target is smaller, ignore right half
            else
                endIndex = midIndex - 1;
        }

        // If we reach here, then element was not present
        System.out.println("Output: Target not found");
        System.out.println(" The target value " + target + " is not in the array.");
    }

    public static boolean Ascending(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }



}
