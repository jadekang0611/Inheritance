package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog();
	    dog.makeSound();
    }
}

class Animal {
    String sound = "";

    void makeSound() {
        System.out.println(sound);
    }

}

class Dog extends Animal {
    Dog() {
        sound = "bark";
    }
}