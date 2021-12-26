package com.j7solution.dogkennel.dto.mapper;

import com.j7solution.dogkennel.dto.request.BreedDTO;
import com.j7solution.dogkennel.entities.Breed;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BreedMapper {

    BreedMapper INSTANCE = Mappers.getMapper(BreedMapper.class);

    Breed toModel(BreedDTO dto);
    BreedDTO toDTO(Breed breed);
}
