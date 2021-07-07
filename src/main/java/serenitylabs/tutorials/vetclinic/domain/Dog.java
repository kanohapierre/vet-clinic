package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;
    private final String breed;
    private final String colour;
    private String favouriteFood;
    private String favouriteToy;

    public Dog(String name, String breed, String colour, String favouriteFood, String favouriteToy,LocalDateTime dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.favouriteFood = favouriteFood;
        this.favouriteToy = favouriteToy;
        this.dateOfBirth = dateOfBirth;
        this.colour = colour;
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

    public String getColour() {
        return colour;
    }

    public static WithBreed called(String name) {
        return new DogBreeder(name);
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public interface WithBreed {
        DogBreeder ofBreed(String breed);
    }

    public interface WithColour {
        DogBreeder ofColour(String colour);
    }

    public static class DogBreeder implements WithBreed {
        private String name;
        private String breed;
        private String colour;
        private String favouriteFood;
        private String favouriteToy;

        public DogBreeder(String name) {
            this.name = name;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBreeder ofColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Dog bornOn(LocalDateTime dateOfBirth) {
            return new Dog(name, breed, colour, favouriteFood, favouriteToy,dateOfBirth);
        }

        public DogBreeder ofFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }

        public DogBreeder ofFavouriteToy(String favouriteToy) {
            this.favouriteToy = favouriteToy;
            return this;
        }
    }
}
