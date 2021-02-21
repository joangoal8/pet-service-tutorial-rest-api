package com.pets.model;

import java.util.Comparator;

public class Dog {

  public static Comparator<Dog> nameComparator = Comparator.comparing(Dog::getName);
  public static Comparator<Dog> ageComparator = Comparator.comparingInt(Dog::getAge);

  private final String id;
  private final String name;
  private final int age;
  private final DogBreed breed;

  private Dog(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.age = builder.age;
    this.breed = builder.breed;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public DogBreed getBreed() {
    return breed;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private String id;
    private String name;
    private int age;
    private DogBreed breed;

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setBreed(DogBreed breed) {
      this.breed = breed;
      return this;
    }

    public Dog build() {
      return new Dog(this);
    }
  }
}
