package com.movie.service;

import com.movie.model.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;
import org.springframework.web.client.RestTemplate;

@RestClientTest(MovieServiceTest.class)
class MovieServiceTest {

    @Autowired
    private MockRestServiceServer server;

    @MockBean
    private MovieService service;

    private RestTemplate restTemplate = new RestTemplate();

    MockRestServiceServer mockRestServiceServer;

    Result response = new Result();

    @BeforeEach
    void init(){
        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    void getMovies(){
        mockRestServiceServer = MockRestServiceServer.bindTo(restTemplate)
                .build();
        mockRestServiceServer.expect(MockRestRequestMatchers.requestTo("/api/movie/615666"))
                .andRespond(MockRestResponseCreators.withSuccess());
        service.getMovie(615666);
    }

    @Test
    void getMovie(){
        mockRestServiceServer = MockRestServiceServer.bindTo(restTemplate)
                .build();
        mockRestServiceServer.expect(MockRestRequestMatchers.requestTo("/api/movies?query=a&page=2"))
                .andRespond(MockRestResponseCreators.withSuccess());
        service.getMovies("a", 2);

    }
}