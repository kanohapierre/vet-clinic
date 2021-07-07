package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewDog {
    @Test
    public void a_new_dog_should_have_a_name() {
        LocalDateTime dateOfBirth = LocalDateTime.now();

        Dog javal = Dog.called("javal")
                       .ofBreed("Caniche")
                       .bornOn(dateOfBirth);

        Assert.assertEquals("javal", javal.getName());
        Assert.assertEquals("Caniche", javal.getBreed());
        Assert.assertEquals(dateOfBirth, javal.getDateOfBirth());

    }
}
