package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;
    private final String breed;
    private final String colour;

    public Dog(String name, String breed, String colour, LocalDateTime dateOfBirth) {
        this.name = name;
        this.breed = breed;
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

    public interface WithBreed {
        DogBreeder ofBreed(String breed);
    }

    public static class DogBreeder implements WithBreed {
        private String name;
        private String breed;
        private String colour;

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
            return new Dog(name, breed, colour, dateOfBirth);
        }
    }
}
