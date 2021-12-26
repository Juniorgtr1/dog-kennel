package com.j7solution.dogkennel.services;

import com.j7solution.dogkennel.dto.mapper.BreedMapper;
import com.j7solution.dogkennel.dto.request.BreedDTO;
import com.j7solution.dogkennel.dto.response.MessageResponseDTO;
import com.j7solution.dogkennel.entities.Breed;
import com.j7solution.dogkennel.repositories.BreedRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BreedService {

    @Autowired
    private BreedRepository breedRepository;

    @Autowired
    private final BreedMapper breedMapper = BreedMapper.INSTANCE;

    public MessageResponseDTO createBreed(BreedDTO breedDTO){
        Breed toSave = breedMapper.toModel(breedDTO);
        Breed breedSaved = breedRepository.save(toSave);
        return createMessageResponse("Breed created sucessfuly, ID ", breedSaved.getId());
    }

    public List<Breed> findAll(){
        return breedRepository.findAll();
    }

    private MessageResponseDTO createMessageResponse(String s, Long id){
        return MessageResponseDTO.builder().message(s + id).build();
    }
}
