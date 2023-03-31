package com.whyelab;

class Animal1 {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig1 extends Animal1 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal1 {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Poly {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();  // Create a Animal object
        Animal1 myPig = new Pig1();  // Create a Pig object
        Animal1 myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
