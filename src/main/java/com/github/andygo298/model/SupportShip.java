package com.github.andygo298.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SupportShip extends SpaceShip {

    private String shipColor;

    public SupportShip(int fuel, String fuelType, String name, int armor, String shipColor) {
        super(fuel, fuelType, name, armor);
        this.shipColor = shipColor;
    }
}
