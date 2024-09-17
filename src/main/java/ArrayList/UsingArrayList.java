package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30,40,50,60));
        numbers.add(70);
        numbers.add(80);
        numbers.remove(5);
        System.out.println(numbers);
        numbers.trimToSize();

        // Iterating over elements
        for (int i = 0; i < numbers.size(); i ++) {
            int element = numbers.get(i);
            System.out.println(element);
        }

        // Using enhanced for loop
        for (int element : numbers) {
            System.out.println(element);
        }

        // For each method
        numbers.forEach(element -> {
            System.out.println(element);
        });

        // Stream
        ArrayList<String> namesOfStudents = new ArrayList<>(Arrays.asList("Dawson", "Steve", "Lisa", "Maz"));
        namesOfStudents.stream().forEach(name -> {
            String namesInCaps = name.toUpperCase();
            System.out.println(namesInCaps);
        });

        // Iterator traversal
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

// For question 3
// Display seating chart
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0

// represent seat has been reserved with an X
// you can reserve and cancel a seat
// you can recomand a seat

