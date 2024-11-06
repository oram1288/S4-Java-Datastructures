package BigONotation;

public class BigONotation {
    // Linear time
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num: arr) { // O(n)
            if (num > max) { // O(1)
                max = num;   // O(1)
            }
        }
        return max; // O(1)
    }

    // O(1) + O(1) + O(1) + O(1) + O(1) = O(4) + O(n)

    // Quadratic time - O(n^2)
    // * if you have an array of [1,2,3,4] it will run 16 times
//    public int tMax(int[] arr) {
//        int max = arr[0]; // O(1)
//        for (int i = 0; i < arr.length; i++) { // O(n)
//            for (int j = 0; j < arr.length; j++) // O(n)
//                if (num > max) { // O(1)
//                    max = num;   // O(1)
//                }
//        }
//        return max; // O(1)
//    }

    // O(1) + O(n) + O(n) + O(1) + O(1) + O(4) + O(n^2)


    public static void main(String[] args) {

        // Constant - O(1)
        int [] arr = {1,2,3,4,5,6,7,8};
        int element = arr[3];

    }
}
