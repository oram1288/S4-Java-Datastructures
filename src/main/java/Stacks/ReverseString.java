package Stacks;

import java.util.Stack;

public class ReverseString {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String filterString = input.replaceAll( "[\\W_]", "").toLowerCase();

        // Push half of the string onto a stack
        int length = filterString.length();
        for (int i = 0; i < length / 2; i++) {
            stack.push(filterString.charAt(i));
        }

        //compare the second half of the string with the stack
        for (int i = (length + 1) / 2; i < length; i++) {
            if (stack.isEmpty() || stack.pop() != filterString.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "Race Car"; // can also try :"Do geese see god"
        System.out.println("Is Palindrome: " + isPalindrome(string));
    }
}
