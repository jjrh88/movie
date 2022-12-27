package com.movie.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductionCompanyTest {

    ProductionCompany company = new ProductionCompany();

    @BeforeEach
    void init() {
        company.setOriginCountry("COLOMBIA");
        company.setLogoPath("URL");
        company.setId(1L);
        company.setName("CO");
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("COLOMBIA", company.getOriginCountry()),
                () -> Assertions.assertEquals("URL", company.getLogoPath()),
                () -> Assertions.assertEquals(1L, company.getId()),
                () -> Assertions.assertEquals("CO", company.getName())
        );
    }
}