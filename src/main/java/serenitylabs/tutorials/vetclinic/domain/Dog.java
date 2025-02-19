package serenitylabs.tutorials.vetclinic.domain;

import java.security.cert.CertPathBuilder;
import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;

    //variables become immutable because name, breed, dateOfBirth are assigned into the constructor

    /*public Dog(String name, String breed, LocalDateTime dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = null;
    }*/
 //or like this
    public Dog(String name, String breed, LocalDateTime dateOfBirth) {
        this(name, breed, dateOfBirth, null);
    }

    public Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
    }

    public static DogBuilder called(String name) {
        return new DogBuilder(name);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public static class DogBuilder {
        private String name;
        private String breed;
        private LocalDateTime birthday;

        public DogBuilder(String name) {
            this.name = name;
        }

        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime birthday) {
            return new Dog(name, breed, birthday);
        }
    }
}
