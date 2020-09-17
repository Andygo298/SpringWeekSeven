package com.github.andygo298.model.parameter;

import com.github.andygo298.enums.FuelType;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TypeOfFuel extends ParameterBase<FuelType> {

    public TypeOfFuel(FuelType value) {
        super(value);
    }
}
