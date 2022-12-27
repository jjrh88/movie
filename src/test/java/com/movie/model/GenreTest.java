package com.movie.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenreTest {

    Genre genre = new Genre();

    @BeforeEach
    void init() {
        genre.setId(1L);
        genre.setName("JHON");
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(1L, genre.getId()),
                () -> Assertions.assertEquals("JHON", genre.getName())
        );
    }
}