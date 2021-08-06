package com.example.rentalservice.controller;

import com.example.rentalservice.model.Movie;
import com.example.rentalservice.service.RentalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental")
public class RentalRestController {

    private final RentalService rentalService;

    public RentalRestController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/return/{id}")
    public ResponseEntity<Void> returnMovie(@PathVariable Long id) {
        rentalService.returnMovie(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/rent/{id}")
    public ResponseEntity<Void> rentMovie(@PathVariable Long id) {
        rentalService.rentMovie(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/exception")
    public ResponseEntity<Void> getException() {
        rentalService.exception();
        return ResponseEntity.ok().build();
    }
}
