package com.j7solution.dogkennel.controllers;

import com.j7solution.dogkennel.entities.Breed;
import com.j7solution.dogkennel.services.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/breeds")
public class BreedController {

    @Autowired
    private BreedService breedService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Breed createBreed(@RequestBody @Valid Breed breed){
        return breedService.createBreed(breed);
    }

    @GetMapping
    public List<Breed> findAll(){
        return breedService.findAll();
    }
}
