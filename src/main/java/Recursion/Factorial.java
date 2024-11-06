package Recursion;

import java.sql.SQLOutput;

public class Factorial {

    // Factorial = (!)
    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    // Recursive
    public int factorialRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Iterative: " + factorial.factorialIterative(5));
        System.out.println("Recursive: " + factorial.factorialRecursive(5));
    }
}
