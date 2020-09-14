package com.github.andygo298.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cruiser.class, name = "cruiser"),
        @JsonSubTypes.Type(value = DeadStar.class, name = "dead-star"),
        @JsonSubTypes.Type(value = Fighter.class, name = "fighter"),
        @JsonSubTypes.Type(value = SpyProbe.class, name = "spy-probe"),
        @JsonSubTypes.Type(value = Transport.class, name = "transport")})
public abstract class SpaceShip {

    private int fuel;
    private String fuelType;
    private String name;
    private int armor;

}
