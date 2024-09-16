package Arrays;

// Calculate the average temp, and give how many days are above the average temp
// 1. Take an input from the user (ex. 5)
// 2. Prompt the user to enter all the 5 numbers (temp values)
// 3. Calculate the average temp
// 4. Given the average temp, how many of the numbers in line 2 are above the average temp?

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user for the number of temperatures
        System.out.print("Enter the number of temperatures: ");
        int numTemps = scanner.nextInt();

        // Step 2: Prompt the user to enter all the temperature values
        int[] temperatures = new int[numTemps];
        for (int i = 0; i < numTemps; i++) {
            System.out.print("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }

        // Step 3: Calculate the average temperature
        double sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        double averageTemp = sum / numTemps;

        System.out.println("Average temperature: " + averageTemp);

        // Step 4: Count how many temperatures are above the average
        int numAboveAverage = 0;
        for (int temp : temperatures) {
            if (temp > averageTemp) {
                numAboveAverage++;
            }
        }

        System.out.println("Number of temperatures above average: " + numAboveAverage);

        scanner.close();
    }
}
