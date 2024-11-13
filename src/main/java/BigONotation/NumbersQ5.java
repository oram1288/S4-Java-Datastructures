package BigONotation;

public class NumbersQ5 {

    // Recursive sum function
    public int sumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }


    // Recursive decimal to binary function
    // * had trouble with this one
    public String decimalToBinaryInt(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        }
        return decimalToBinaryInt(n / 2) + (n % 2);
    }

    // Convert fractional part to binary
    public String decimalToBinaryFraction(double fraction) {
        StringBuilder binaryFraction = new StringBuilder();
        int maxBits = 10; // Limit to avoid infinite loop for repeating fractions
        while (fraction > 0 && binaryFraction.length() < maxBits) {
            fraction *= 2;
            if (fraction >= 1) {
                binaryFraction.append("1");
                fraction -= 1;
            } else {
                binaryFraction.append("0");
            }
        }
        return binaryFraction.toString();
    }

    // Convert a double to binary representation
    public String decimalToBinary(double num) {
        int integerPart = (int) num;
        double fractionalPart = num - integerPart;

        // Convert integer and fractional parts separately
        String integerBinary = decimalToBinaryInt(integerPart);
        String fractionalBinary = decimalToBinaryFraction(fractionalPart);

        // Combine both parts
        return fractionalBinary.isEmpty() ? integerBinary : integerBinary + "." + fractionalBinary;
    }


    public static void main(String[] args) {
        NumbersQ5 test = new NumbersQ5();

        System.out.println("Sum: " + test.sumRecursive(4));

        System.out.println("Decimal: " + test.decimalToBinary(6.5));
    }
}
