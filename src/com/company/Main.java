package com.company;

public class Main {

    public static void main(String[] args) {
	    Object[] list = {new Dog(), new DogFood()};
	    Dog dog = (Dog) list[0];
//	    dog.makeSound();
        for(Object object : list) {
            if(object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }
	    System.out.printf("Animal Farm?");
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

class DogFood {}