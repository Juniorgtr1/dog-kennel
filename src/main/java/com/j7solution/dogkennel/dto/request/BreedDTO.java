package com.j7solution.dogkennel.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BreedDTO {

    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @NotEmpty
    private String caracteristics;
}
