package com.whyelab;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor prevents direct instantiation
    private Singleton() {
        // Initialization code here
        System.out.println("Singleton instance created.");
    }

    // Public static method to access the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

    public static void main(String[] args) {
        // Attempt to create multiple instances
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        // Both instances should be the same
        System.out.println("Are both instances the same? " + (firstInstance == secondInstance));

        // Use the singleton instance to do something
        firstInstance.doSomething();
    }
}
