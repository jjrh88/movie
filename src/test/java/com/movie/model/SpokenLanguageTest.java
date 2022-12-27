package com.movie.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpokenLanguageTest {

    SpokenLanguage language = new SpokenLanguage();

    @BeforeEach
    void init() {
        language.setName("Español");
        language.setEnglishName("Spanish");
        language.setIso6391("Iso6391");
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("Español", language.getName()),
                () -> Assertions.assertEquals("Spanish", language.getEnglishName()),
                () -> Assertions.assertEquals("Iso6391", language.getIso6391())
        );
    }
}