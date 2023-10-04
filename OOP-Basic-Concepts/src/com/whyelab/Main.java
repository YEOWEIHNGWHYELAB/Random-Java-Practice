package com.whyelab;

// 1. Classes and Objects
// Define a class called "Vehicle"
class Vehicle {
    // Attributes
    private String make;
    private String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Methods
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

// 2. Encapsulation: The attributes (make and model) are encapsulated and accessed through getters.

// 3. Inheritance: Create a subclass "Car" that inherits from "Vehicle"
class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model); // Call the constructor of the superclass
        this.numDoors = numDoors;
    }

    // Method overriding: Override the start method
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Additional method specific to Car
    public void honkHorn() {
        System.out.println("Honk! Honk!");
    }
}

// 4. Polymorphism: Create a function that accepts a Vehicle reference but can work with both Vehicle and Car objects
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Camry");
        Car car1 = new Car("Honda", "Civic", 4);

        // Polymorphism: Using a Vehicle reference to access Car object
        Vehicle vehicle2 = car1;

        // Calling methods on objects
        vehicle1.start(); // Output: The vehicle is starting.
        car1.start();     // Output: The car is starting.

        // Polymorphism: Calling overridden method on Car object
        vehicle2.start();  // Output: The car is starting.

        // Accessing attributes using getters
        System.out.println("Vehicle Make: " + vehicle1.getMake()); // Output: Vehicle Make: Toyota
        System.out.println("Car Model: " + car1.getModel());       // Output: Car Model: Civic

        // Using a Car-specific method
        car1.honkHorn(); // Output: Honk! Honk!
    }
}
