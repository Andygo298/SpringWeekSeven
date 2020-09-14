package com.github.andygo298.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CombatShip extends SpaceShip {

    private int firePower;

    public CombatShip(int fuel, String fuelType, String name, int armor, int firePower) {
        super(fuel, fuelType, name, armor);
        this.firePower = firePower;
    }
}

