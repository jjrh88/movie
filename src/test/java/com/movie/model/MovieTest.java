package com.movie.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

class MovieTest {

    Movie movie = new Movie();

    @BeforeEach
    void init() {
        movie.setId(1L);
        movie.setAdult(Boolean.TRUE);
        movie.setBackdropPath("null");
        movie.setGenreIds(Arrays.asList(1l, 2l, 3l));
        movie.setOriginalLanguage("null");
        movie.setOriginalTitle("null");
        movie.setOverview("On a cold");
        movie.setPopularity(696.02);
        movie.setPosterPath("null");
        movie.setReleaseDate("null");
        movie.setTitle("Scrooge");
        movie.setVideo(Boolean.TRUE);
        movie.setVoteAverage(null);
        movie.setVoteCount(3L);
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(1L, movie.getId()),
                () -> Assertions.assertEquals(Boolean.TRUE, movie.getAdult()),
                () -> Assertions.assertEquals("null", movie.getBackdropPath()),
                () -> Assertions.assertEquals(3, movie.getGenreIds().size()),
                () -> Assertions.assertEquals("null", movie.getOriginalLanguage()),
                () -> Assertions.assertEquals("null", movie.getOriginalTitle()),
                () -> Assertions.assertEquals("On a cold", movie.getOverview()),
                () -> Assertions.assertEquals(696.02, movie.getPopularity()),
                () -> Assertions.assertEquals("null", movie.getPosterPath()),
                () -> Assertions.assertEquals("null", movie.getReleaseDate()),
                () -> Assertions.assertEquals("Scrooge", movie.getTitle()),
                () -> Assertions.assertEquals(Boolean.TRUE, movie.getVideo()),
                () -> Assertions.assertEquals(null, movie.getVoteAverage()),
                () -> Assertions.assertEquals(3L, movie.getVoteCount())
        );
    }
}