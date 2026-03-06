import java.util.Scanner;
import java.util.Stack;

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
        System.out.print("Input : ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

// push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

// compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
