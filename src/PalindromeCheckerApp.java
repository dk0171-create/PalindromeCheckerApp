import java.util.Scanner;

public class PalindromeCheckerApp {
    /*
    Use Case 1: Application Entry & Welcome Message
Description:
This class represents the entry point of the
Palindrome Checker Management System.
At this stage, the application:
Starts execution from the main() method
Displays a welcome message
Shows application version
No palindrome logic is implemented yet.
The goal is to establish a clear startup flow.
@author Developer
@version 1.6
*/
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        String reverse = "";

// reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

// check palindrome
        if (input.equals(reverse))
            System.out.println("Is it a Palindrome? : true");
        else
            System.out.println("Is it a Palindrome? : false");
    }
}
