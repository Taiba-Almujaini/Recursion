import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to reverse:"); // ask user to enter word
        String inputWord = scanner.nextLine();
        String reverseWord=reverseWord(inputWord); // call reverseWord function 
        System.out.println("The reverse of " + inputWord+ " is : "+ reverseWord);


    }

    public static String reverseWord (String word)
    {
        if (word.isEmpty())
        {
            return  word;
        }

        return reverseWord(word.substring(1)) + word.charAt(0);//word.substring(1) extracts a substring from the original string word, starting from index 1
        //word.charAt(0): This retrieves the first character of the original string word.
    }
}