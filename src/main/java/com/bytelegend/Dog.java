package com.bytelegend;

public class Dog {
    private String name;
    private String gender;
    private int age;
    private String color;
    private String breed;
    private int size;
    private int weight;
    private boolean cute;

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isCute() {
        return cute;
    }
}
