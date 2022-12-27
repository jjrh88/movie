package com.movie.controller;

import com.movie.model.MovieDetail;
import com.movie.service.MovieService;
import com.movie.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(value = "/movies")
    public ResponseEntity<Result> getMovies( @RequestParam(required = true) String query,
                                             @RequestParam(required = true) int page ) {
       return ResponseEntity.ok(movieService.getMovies(query, page));
    }

    @GetMapping(value = "/movie/{id}")
    public ResponseEntity<MovieDetail> getMovie(@PathVariable("id") int movieId ) {
        return ResponseEntity.ok(movieService.getMovie(movieId));
    }

}
