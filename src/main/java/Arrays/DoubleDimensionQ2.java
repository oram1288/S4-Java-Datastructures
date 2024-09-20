package Arrays;

public class DoubleDimensionQ2 {
    int[][] arr;

    public DoubleDimensionQ2(int rows, int columns) {
        arr = new int[rows][columns];
        // Initialize all elements to Integer.MIN_VALUE
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Insert method
    public void insert(int valueToInsert, int row, int column) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                arr[row][column] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // Traverse method
    public void traverse() {
        try {
            int rows = arr.length;
            int columns = arr[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    // Search for an element
    public void search(int valueToSearch) {
        try {
            int rows = arr.length;
            int columns = arr[0].length;
            boolean found = false;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (arr[i][j] == valueToSearch) {
                        System.out.println("Value " + valueToSearch + " is found at position [" + i + "][" + j + "]");
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("Value " + valueToSearch + " is not found in the array");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    // Delete an element at specific index
    public void delete(int row, int column) {
        try {
            arr[row][column] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    public static void main(String[] args) {
        DoubleDimensionQ2 doubleArray = new DoubleDimensionQ2(3, 4);

        // Inserting elements
        doubleArray.insert(5, 0, 0);
        doubleArray.insert(10, 1, 2);
        doubleArray.insert(20, 2, 3);

        // Traversing the array
        System.out.println("Array:");
        doubleArray.traverse();

        // Search for an element
        doubleArray.search(10);

        // Delete an element
        doubleArray.delete(1, 2);

        // Traversing after an element is deleted
        System.out.println("Array after deletion:");
        doubleArray.traverse();
    }
}