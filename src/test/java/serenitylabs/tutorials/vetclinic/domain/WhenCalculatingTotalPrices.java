package serenitylabs.tutorials.vetclinic.domain;

import com.google.common.collect.Range;
import org.junit.Test;

import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenCalculatingTotalPrices {

    @Test
    public void total_consultation_price_should_include_20_percent_tax() throws Exception {
        // GIVEN
        int netPrice = 100;

        // WHEN
        int totalPrice = TotalConsultationPrice.includingTax().forANetPriceOf(netPrice);

        // THEN
        //Assert.assertEquals(120, totalPrice);
        assertThat(totalPrice, is(Range.greaterThan(120)));
    }
}
