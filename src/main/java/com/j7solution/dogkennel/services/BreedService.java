package com.j7solution.dogkennel.services;

import com.j7solution.dogkennel.entities.Breed;
import com.j7solution.dogkennel.repositories.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BreedService {

    @Autowired
    private BreedRepository breedRepository;

    public Breed createBreed(Breed breed){
        return breedRepository.save(breed);
    }

    public List<Breed> findAll(){
        return breedRepository.findAll();
    }
}
