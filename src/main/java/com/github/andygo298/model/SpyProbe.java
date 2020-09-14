package com.github.andygo298.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("spy-probe")
public class SpyProbe extends SupportShip {

    private String scanSensor;

    @Builder
    public SpyProbe(int fuel, String fuelType, String name, int armor, String shipColor, String scanSensor) {
        super(fuel, fuelType, name, armor, shipColor);
        this.scanSensor = scanSensor;
    }
}
