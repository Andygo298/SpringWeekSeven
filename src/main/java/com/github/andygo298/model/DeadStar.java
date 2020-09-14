package com.github.andygo298.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("dead-star")
public class DeadStar extends CombatShip {

    private int maxCapacityOfFighters;

    @Builder
    public DeadStar(int fuel, String fuelType, String name, int armor, int firePower, int maxCapacityOfFighters) {
        super(fuel, fuelType, name, armor, firePower);
        this.maxCapacityOfFighters = maxCapacityOfFighters;
    }
}
