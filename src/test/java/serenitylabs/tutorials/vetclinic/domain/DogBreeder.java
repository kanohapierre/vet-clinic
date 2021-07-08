package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBreeder implements  WithBreed, WithColour, WithName{
        private String name;
        private String breed;
        private String colour;
        private String favouriteFood;
        private String favouriteToy;

        public static DogBreeder aDog(){
            return new DogBreeder();
        }

        public static WithName aLargeDog() {
            return aDog().ofBreed("Labrador");
        }

        public static WithName aSmallDog() {
            return aDog().ofBreed("Poodle");
        }

        public static WithName aGuardDog() {
            return aDog().ofBreed("Poodle");
        }

        public DogBreeder called(String name) {
            this.name = name;
            return this;
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