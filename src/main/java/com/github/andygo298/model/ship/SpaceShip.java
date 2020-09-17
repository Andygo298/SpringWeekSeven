package com.github.andygo298.model.ship;

import com.github.andygo298.enums.FuelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class SpaceShip {

    private String shipName;
    private Integer fuel;
    private FuelType fuelType;
    private Integer armor;

}
