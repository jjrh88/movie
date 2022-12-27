package com.movie.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResultTest {

    Result result = new Result();
    List<Movie> movies = new ArrayList<>();

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
        movies.add(movie);
        result.setMovies(movies);
        result.setPage(1);
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(1, result.getMovies().size()),
                () -> Assertions.assertEquals(1, result.getPage())
        );
    }
}