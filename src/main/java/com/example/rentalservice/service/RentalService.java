package com.example.rentalservice.service;

import com.example.rentalservice.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String findMovieById(Long id) {
        ResponseEntity<String> forEntity1 = restTemplate.getForEntity("http://localhost:8080", String.class);
        String forEntity = forEntity1.getBody();
        return forEntity;
    }

    public Movie getMovie(Long id) {
        return null;
    }
}
