package com.github.andygo298.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("fighter")
public class Fighter extends CombatShip {
    private int flightSpeed;

    @Builder
    public Fighter(int fuel, String fuelType, String name, int armor, int firePower, int flightSpeed) {
        super(fuel, fuelType, name, armor, firePower);
        this.flightSpeed = flightSpeed;
    }
}
