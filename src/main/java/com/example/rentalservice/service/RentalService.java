package com.example.rentalservice.service;

import com.example.rentalservice.model.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;
    @Value("${movie.url}")
    private String movieUrl;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Movie getMovie(Long id) {
        return restTemplate.getForEntity(movieUrl + id, Movie.class).getBody();
    }

    public void returnMovie(Long id) {
        restTemplate.put(movieUrl + "return/" + id, null);
    }

    public void rentMovie(Long id) {
        restTemplate.put(movieUrl + "rent/" + id, null);
    }

    public void exception() {
        restTemplate.getForEntity(movieUrl + "exception/", null).getBody();
    }

}
