package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	   Dog dog1 = new Dog("bark");
	   Dog dog2 = new Dog("woof");
	   System.out.println(dog1.equals(dog2));
    }
}

abstract class Animal {
    String sound = "";

    Animal(String sound){
        this.sound = sound;
    }

    abstract void findFood();

    void makeSound() {
        System.out.println(sound);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }
}

class Dog extends Animal {
    Dog(String sound) {
       super(sound);
    }

    @Override
    void findFood() {
        System.out.println("*looks at human*");
        makeSound();
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("*wags tail*");
    }




}

class DogFood {}