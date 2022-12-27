package com.movie.service;

import com.movie.model.MovieDetail;
import com.movie.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
    @Autowired
    RestTemplate restTemplate;

    @Value("${base.url}")
    private String baseUrl;

    @Value("${api.key}")
    private String apiKey;
    public Result getMovies(String query, int page){
        ResponseEntity<Result> response =
                restTemplate.getForEntity(
                        baseUrl.concat("search/movie?api_key=")
                                .concat(apiKey)
                                .concat("&query=")
                                .concat(query)
                                .concat("&page")
                                .concat(String.valueOf(page)),
                        Result.class);
        return response.getBody();
    }

    public MovieDetail getMovie(int movieId) {
        ResponseEntity<MovieDetail> response =
                restTemplate.getForEntity(
                        baseUrl.concat("movie/")
                                .concat(String.valueOf(movieId))
                                .concat("?api_key=")
                                .concat(apiKey),
                        MovieDetail.class);
        return response.getBody();

    }
}