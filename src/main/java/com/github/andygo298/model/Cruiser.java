package com.github.andygo298.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("cruiser")
public class Cruiser extends CombatShip {

    private int numOfGuns;

    @Builder
    public Cruiser(int fuel, String fuelType, String name, int armor, int firePower, int numOfGuns) {
        super(fuel, fuelType, name, armor, firePower);
        this.numOfGuns = numOfGuns;
    }

    public static Cruiser createShip(ShipType shipType) {
        return new Cruiser();
    }
}
