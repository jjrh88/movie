package com.movie.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductionCountryTest {

    ProductionCountry country = new ProductionCountry();

    @BeforeEach
    void init() {
        country.setName("USA");
        country.setIso31661("iso");
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("USA", country.getName()),
                () -> Assertions.assertEquals("iso", country.getIso31661())
        );
    }
}