import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

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
        // Define the input string
        String input = "A man a plan a canal Panama";

// Normalize the string: remove non-letters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

// Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

// Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

// Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
