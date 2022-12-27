package com.movie.controller;

import com.movie.model.MovieDetail;
import com.movie.model.Result;
import com.movie.service.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MovieController.class)
class MovieControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MovieService service;

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void getMovie() throws Exception {
        MovieDetail detail = new MovieDetail();
        when(service.getMovie(615666)).thenReturn(detail);
        this.mockMvc.perform(get("/api/movie/615666")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    void getMovies() throws Exception {
        Result result = new Result();
        when(service.getMovies("a",1)).thenReturn(result);
        this.mockMvc.perform(get("/api/movies?")
                .param("query","a")
                .param("page","2")).andDo(print()).andExpect(status().isOk());
    }
}