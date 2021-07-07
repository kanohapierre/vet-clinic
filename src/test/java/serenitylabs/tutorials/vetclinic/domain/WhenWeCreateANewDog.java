package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewDog {

    private final static LocalDateTime dateOfBirth = LocalDateTime.now();

    @Test
    public void a_new_dog_should_have_a_name() {

        Dog javal = Dog.called("javal")
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
        Dog javal = Dog.called("Javal")
                       .ofBreed("Caniche")
                       .ofColour("Black")
                       .ofFavouriteFood("Carbonara")
                       .bornOn(dateOfBirth);

        Assert.assertEquals("Javal", javal.getName());
        Assert.assertEquals("Caniche", javal.getBreed());
        Assert.assertEquals("Black", javal.getColour());
        Assert.assertEquals("Carbonara", javal.getFavouriteFood());
        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() {
        Dog javal = Dog.called("Javal")
                       .ofBreed("Caniche")
                       .ofColour("Black")
                       .ofFavouriteToy("XBOX")
                       .bornOn(dateOfBirth);

        Assert.assertEquals("Javal", javal.getName());
        Assert.assertEquals("Caniche", javal.getBreed());
        Assert.assertEquals("Black", javal.getColour());
        Assert.assertEquals("XBOX", javal.getFavouriteToy());
        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());
    }
}
