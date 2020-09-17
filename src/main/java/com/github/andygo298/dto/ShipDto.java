package com.github.andygo298.dto;

import com.github.andygo298.enums.ShipType;
import com.github.andygo298.model.parameter.Parameter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShipDto {

    ShipType type;
    List<Parameter> parameters;
}
