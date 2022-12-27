package com.movie.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Result implements Serializable {

    @JsonProperty("page")
    private int page;

    @JsonProperty("results")
    private List<Movie> movies;
}
