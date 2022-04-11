package com.bytelegend;

import com.github.hcsp.test.helper.ClassInspector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void noPublicFields() {
        ClassInspector.assertAllFieldsArePrivate(Home.class, Dog.class, Cat.class);
    }

    @Test
    public void test() {
        Cat cat = new Cat();
        cat.setName("cat");
        cat.setAge(1);
        cat.setColor("white");
        cat.setCute(true);
        Assertions.assertEquals("cat", cat.getName());
        Assertions.assertEquals(1, cat.getAge());
        Assertions.assertEquals("white", cat.getColor());
        Assertions.assertTrue(cat.isCute());

        Dog dog = new Dog();
        dog.setName("dog");
        dog.setGender("M");
        dog.setAge(2);
        dog.setColor("black");
        dog.setWeight(10);
        dog.setBreed("pug");
        dog.setSize(1);
        dog.setWeight(10);
        dog.setCute(true);
        Assertions.assertEquals("dog", dog.getName());
        Assertions.assertEquals("M", dog.getGender());
        Assertions.assertEquals(2, dog.getAge());
        Assertions.assertEquals("black", dog.getColor());
        Assertions.assertEquals(10, dog.getWeight());
        Assertions.assertEquals("pug", dog.getBreed());
        Assertions.assertEquals(1, dog.getSize());
        Assertions.assertEquals(10, dog.getWeight());
        Assertions.assertTrue(dog.isCute());

        Home home = new Home();
        home.setCat(cat);
        home.setDog(dog);
        Assertions.assertEquals(cat, home.getCat());
        Assertions.assertEquals(dog, home.getDog());
    }
}
