package Queues;

import java.util.LinkedList;

public class AnimalShelterQ4 {
    // An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.

    // Animal class (abstract base class)
    abstract class Animal {
        private String name;
        private int order; // Timestamp or order of arrival

        public Animal(String name) {
            this.name = name;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getOrder() {
            return order;
        }

        public String getName() {
            return name;
        }

        // Compare arrival orders between animals
        public boolean isOlderThan(Animal a) {
            return this.order < a.getOrder();
        }
    }

    // Dog class extends Animal
    public class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    // Cat class extends Animal
    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0; // A timestamp for animal's arrival

    // Add an animal to the shelter
    public void enqueue(Animal a) {
        a.setOrder(order);
        order++;

        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    // Adopt the oldest animal (either a dog or a cat)
    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        // Compare the oldest dog and cat
        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if (oldestDog.isOlderThan(oldestCat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    // Adopt the oldest dog
    public Dog dequeueDog() {
        if (!dogs.isEmpty()) {
            if (dogs.size() > 1) {
                System.out.println("You must adopt the oldest dog.");
            }
            return dogs.poll(); // Remove and return the oldest dog
        }
        return null;
    }

    // Adopt the oldest cat
    public Cat dequeueCat() {
        if (!cats.isEmpty()) {
            if (cats.size() > 1) {
                System.out.println("You must adopt the oldest cat.");
            }
            return cats.poll(); // Remove and return the oldest cat
        }
        return null;
    }
}
