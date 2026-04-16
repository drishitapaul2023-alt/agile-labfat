package com.example;

import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    void testDogSound() {
        Dog dog = new Dog();
        dog.sound();
    }

    @Test
    void testCatSound() {
        Cat cat = new Cat();
        cat.sound();
    }
}