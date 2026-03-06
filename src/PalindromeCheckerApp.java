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
        String input = "madam";

// Check palindrome using recursion
        boolean isPalindrome = check(input, 0, input.length() - 1);

// Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

// Base case: one or no character left
        if (start >= end) {
            return true;
        }

// If characters at start and end do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

// Recursive call
        return check(s, start + 1, end - 1);
    }
}
