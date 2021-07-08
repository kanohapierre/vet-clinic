package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewDog {

    private final static LocalDateTime dateOfBirth = LocalDateTime.now();

    @Test
    public void a_new_dog_should_have_a_name() {

        Dog javal = DogBreeder.aLargeDog().called("javal")
                       .ofBreed("Caniche")
                       .ofColour("Black")
                       .bornOn(dateOfBirth);

        Assert.assertEquals("javal", javal.getName());
        Assert.assertEquals("Caniche", javal.getBreed());
        Assert.assertEquals("Black", javal.getColour());
        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());

    }

//    @Test
//    public void a_dog_can_have_an_optional_colour() {
//        Dog javal = Dog.called("Javal")
//                .ofBreed("Caniche")
//                .ofColour("black")
//                .bornOn(dateOfBirth);
//
//        Assert.assertEquals("Javal",javal.getName());
//        Assert.assertEquals("Caniche",javal.getBreed());
//        Assert.assertEquals("black",javal.getColour());
//        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());
//    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food() {
        Dog javal = DogBreeder.aSmallDog().called("Javal1")
                       .ofBreed("Caniche1")
                       .ofColour("Black1")
                       .ofFavouriteFood("Carbonara1")
                       .bornOn(dateOfBirth);

        Assert.assertEquals("Javal1", javal.getName());
        Assert.assertEquals("Caniche1", javal.getBreed());
        Assert.assertEquals("Black1", javal.getColour());
        Assert.assertEquals("Carbonara1", javal.getFavouriteFood());
        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() {
        Dog javal = DogBreeder.aGuardDog().called("Javal2")
                       .ofBreed("Caniche2")
                       .ofColour("Black2")
                       .ofFavouriteToy("XBOX2")
                       .bornOn(dateOfBirth);

        Assert.assertEquals("Javal2", javal.getName());
        Assert.assertEquals("Caniche2", javal.getBreed());
        Assert.assertEquals("Black2", javal.getColour());
        Assert.assertEquals("XBOX2", javal.getFavouriteToy());
        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());
    }
}
