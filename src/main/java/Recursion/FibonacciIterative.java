package Recursion;

public class FibonacciIterative {

    // Iteration
    public int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i ++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Recursive
    public int fibonacciRecursive(int n) {
        // Second step
        if (n <= 1) {
            return n;
        }

        // First step
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n -2);
    }


    public static void main(String[] args) {
        FibonacciIterative test = new FibonacciIterative();
        System.out.println("Iteration: " + test.fibonacci(4));

        System.out.println("Recursive: " + test.fibonacciRecursive(4));
    }
}
