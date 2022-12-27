package com.movie.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MovieDetailTest {

    MovieDetail movieDetail = new MovieDetail();
    List<Genre> genres = new ArrayList<>();
    Genre genre = new Genre();
    List<ProductionCompany> companies = new ArrayList<>();
    ProductionCompany company = new ProductionCompany();

    List<ProductionCountry> productionCountries = new ArrayList<>();

    ProductionCountry country = new ProductionCountry();

    List<SpokenLanguage> spokenLanguages = new ArrayList<>();
    SpokenLanguage language = new SpokenLanguage();

    @BeforeEach
    void init() {
        language.setEnglishName("EN");
        language.setIso6391("Iso6391");
        language.setName("English");
        spokenLanguages.add(language);
        company.setId(1L);
        company.setName("COLOMBIA");
        company.setLogoPath("LogoPath");
        company.setOriginCountry("USA");
        country.setIso31661("31661");
        country.setName("COLOMBIA");
        productionCountries.add(country);
        companies.add(company);
        genre.setId(1L);
        genre.setName("JHON");
        genres.add(genre);
        movieDetail.setId(1L);
        movieDetail.setSpokenLanguages(spokenLanguages);
        movieDetail.setAdult(Boolean.TRUE);
        movieDetail.setBackdropPath("null");
        movieDetail.setBelongsToCollection(null);
        movieDetail.setBudget(5L);
        movieDetail.setGenres(genres);
        movieDetail.setHomepage("null");
        movieDetail.setImdbId("null");
        movieDetail.setOriginalLanguage("null");
        movieDetail.setOriginalTitle("null");
        movieDetail.setOverview("On a cold");
        movieDetail.setPopularity(696.02);
        movieDetail.setPosterPath("null");
        movieDetail.setReleaseDate("null");
        movieDetail.setTitle("Scrooge");
        movieDetail.setVideo(Boolean.TRUE);
        movieDetail.setVoteAverage(null);
        movieDetail.setVoteCount(3L);
        movieDetail.setProductionCompanies(companies);
        movieDetail.setProductionCountries(productionCountries);
        movieDetail.setRevenue(90L);
        movieDetail.setRuntime(80L);
        movieDetail.setStatus("active");
        movieDetail.setTagline("title");
    }

    @Test
    void validateAttributes() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(1, movieDetail.getSpokenLanguages().size()),
                () -> Assertions.assertEquals("null", movieDetail.getImdbId()),
                () -> Assertions.assertEquals(1, movieDetail.getProductionCompanies().size()),
                () -> Assertions.assertEquals(1, movieDetail.getProductionCountries().size()),
                () -> Assertions.assertEquals(90L, movieDetail.getRevenue()),
                () -> Assertions.assertEquals(80L, movieDetail.getRuntime()),
                () -> Assertions.assertEquals(80L, movieDetail.getRuntime()),
                () -> Assertions.assertEquals("null", movieDetail.getOriginalLanguage()),
                () -> Assertions.assertEquals("active", movieDetail.getStatus()),
                () -> Assertions.assertEquals("title", movieDetail.getTagline()),
                () -> Assertions.assertEquals("null", movieDetail.getOriginalTitle()),
                () -> Assertions.assertEquals("On a cold", movieDetail.getOverview()),
                () -> Assertions.assertEquals(696.02, movieDetail.getPopularity()),
                () -> Assertions.assertEquals("null", movieDetail.getPosterPath()),
                () -> Assertions.assertEquals("null", movieDetail.getReleaseDate()),
                () -> Assertions.assertEquals("Scrooge", movieDetail.getTitle()),
                () -> Assertions.assertEquals(Boolean.TRUE, movieDetail.getVideo()),
                () -> Assertions.assertEquals(null, movieDetail.getVoteAverage()),
                () -> Assertions.assertEquals(3L, movieDetail.getVoteCount())
        );
    }

}