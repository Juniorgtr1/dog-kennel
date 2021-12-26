package com.j7solution.dogkennel.controllers;

import com.j7solution.dogkennel.dto.request.BreedDTO;
import com.j7solution.dogkennel.dto.response.MessageResponseDTO;
import com.j7solution.dogkennel.entities.Breed;
import com.j7solution.dogkennel.services.BreedService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Builder
@RestController
@Controller
@AllArgsConstructor
@RequestMapping(path = "/api/v1/breeds")
public class BreedController {

    @Autowired
    private BreedService breedService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createBreed(@RequestBody @Valid BreedDTO breedDTO){
        return breedService.createBreed(breedDTO);
    }

    @GetMapping
    public List<Breed> findAll(){
        return breedService.findAll();
    }
}
