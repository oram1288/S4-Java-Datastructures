package Queues;

public class AnimalMain {
    public static void main(String[] args) {
        // Create a new Animal Shelter
        AnimalShelterQ4 shelter = new AnimalShelterQ4();

        // Enqueue some animals
        shelter.enqueue(shelter.new Dog("Rover"));
        shelter.enqueue(shelter.new Cat("Whiskers"));
        shelter.enqueue(shelter.new Dog("Fido"));
        shelter.enqueue(shelter.new Cat("Luna"));

        // Dequeue Any (Should adopt the oldest animal, Rover)
        System.out.println("Adopted: " + shelter.dequeueAny().getName());

        // Dequeue a Cat (Should adopt the oldest cat, Whiskers)
        System.out.println("Adopted: " + shelter.dequeueCat().getName());

        // Dequeue Any (Should adopt the only remaining animal, Luna the cat)
        System.out.println("Adopted: " + shelter.dequeueAny().getName());

        // Dequeue a Dog (Should adopt the next dog, Fido)
        System.out.println("Adopted: " + shelter.dequeueAny().getName());
    }
}
