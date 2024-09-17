package Arrays;

// 1. Insert
// 2. Traverse and array
// 4. Search for an element
// 4. Delete an array (entire array and a specific element)

public class SingleDimension {
    int arr[] = null;

    public SingleDimension (int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Insert method
    public void insert(int valueToInsert, int index) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = valueToInsert;
                System.out.print("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // Traverse an array
    public void traverse(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("array no longer exist");
        }
    }

    // Search for an element
    public void searchArray (int valueToSearch){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // Delete value from the array
    public void deleteValueAtIndex(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        SingleDimension singleDimension = new SingleDimension(4);
        singleDimension.insert(3,0);
        singleDimension.insert(4,1);
        singleDimension.insert(5,2);
        singleDimension.insert(6,3);

        singleDimension.traverse();
//        singleDimension.searchArray(7);
        singleDimension.deleteValueAtIndex(1);
        singleDimension.traverse();

        System.out.println(singleDimension.toString());
    }
}
