package com.zwvalidator;

import com.github.zwvalidator.CommonValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CommonValidatorTests {

    @Test
    public void testMobileNumber_whenNumberIsValid() {
        assertAll( "Mobile number is valid" ,
                () -> assertThat(CommonValidator.isValidMobileNumber("+263773000000")).isEqualTo(true),
                () -> assertThat(CommonValidator.isValidMobileNumber("263773000000")).isEqualTo(true),
                () -> assertThat(CommonValidator.isValidMobileNumber("0775000000")).isEqualTo(true),
                () -> assertThat(CommonValidator.isValidMobileNumber("0734999999")).isEqualTo(true),
                () -> assertThat(CommonValidator.isValidMobileNumber("0782111111")).isEqualTo(true),
                () -> assertThat(CommonValidator.isValidMobileNumber("0712000000")).isEqualTo(true)
        );
    }

    @Test
    public void testMobileNumber_whenNumberIsNotValid() {
        assertAll( "Mobile number is not a valid Zimbabwean number" ,
                () -> assertEquals(false, CommonValidator.isValidMobileNumber("773000000")),
                () -> assertEquals(false, CommonValidator.isValidMobileNumber("074300000")),
                () -> assertEquals(false, CommonValidator.isValidMobileNumber("098300000")),
                () -> assertEquals(false, CommonValidator.isValidMobileNumber(null)),
                () -> assertEquals(false, CommonValidator.isValidMobileNumber(""))
        );
    }

    @Test
    public void testPassportNumber_whenValid() {
        assertAll( "Number is a valid Zimbabwean passport number" ,
                () -> assertEquals(true, CommonValidator.isValidPassportNumber("ZZ000000")),
                () -> assertEquals(true, CommonValidator.isValidPassportNumber("AA999999"))
        );
    }

    @Test
    public void testPassportNumber_whenNumberIsNotValid() {
        assertAll( "Passport number is not a valid Zimbabwean passport number" ,
                () -> assertEquals(false, CommonValidator.isValidPassportNumber("29T89899")),
                () -> assertEquals(false, CommonValidator.isValidPassportNumber("MM9076"))
        );
    }

    @Test
    public void testDriverLicenceNumber_whenValid() {
        assertAll( "Number is a valid Zimbabwean driver licence number" ,
                () -> assertEquals(true, CommonValidator.isValidDriverLicence("00000BB")),
                () -> assertEquals(true, CommonValidator.isValidDriverLicence("12345cv"))
        );
    }

    @Test
    public void testDriverLicenceNumber_whenNotValid() {
        assertAll( "Driver licence number is not a valid Zimbabwean driver licence number" ,
                () -> assertEquals(false, CommonValidator.isValidDriverLicence("29T89899")),
                () -> assertEquals(false, CommonValidator.isValidDriverLicence("MM9076"))
        );
    }

    @Test
    public void testIDNumber_whenValid() {
        assertAll( "Input is a valid Zimbabwean national ID number" ,
                () -> assertEquals(true, CommonValidator.isValidId("00-111111P99")),
                () -> assertEquals(true, CommonValidator.isValidId("00 2222222H00"))
        );
    }

    @Test
    public void testIDNumber_whenNotValid() {
        assertAll( "Input is not a valid Zimbabwean national ID number" ,
                () -> assertEquals(false, CommonValidator.isValidId("M1000000000")),
                () -> assertEquals(false, CommonValidator.isValidId("11-00000H00"))
        );
    }

    @Test
    public void testNumberPlate_whenValid() {
        assertAll( "Input is a valid Zimbabwean vehicle number plate" ,
                () -> assertEquals(true, CommonValidator.isValidNumberPlate("ABC0000")),
                () -> assertEquals(true, CommonValidator.isValidNumberPlate("ABC 0000")),
                () -> assertEquals(true, CommonValidator.isValidNumberPlate("ABC-0000"))

        );
    }

    @Test
    public void testNumberPlate_whenNotValid() {
        assertAll( "Input is not a valid Zimbabwean vehicle number plate" ,
                () -> assertEquals(false, CommonValidator.isValidNumberPlate("abv890")),
                () -> assertEquals(false, CommonValidator.isValidNumberPlate("1234567"))
        );
    }



}
