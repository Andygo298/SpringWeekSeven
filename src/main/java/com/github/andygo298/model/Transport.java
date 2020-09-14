package com.github.andygo298.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("transport")
public class Transport extends SupportShip {

    private int carryingCapacity;

    @Builder
    public Transport(int fuel, String fuelType, String name, int armor, String shipColor, int carryingCapacity) {
        super(fuel, fuelType, name, armor, shipColor);
        this.carryingCapacity = carryingCapacity;
    }
}
