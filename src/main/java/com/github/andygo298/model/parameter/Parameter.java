package com.github.andygo298.model.parameter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@JsonTypeInfo(use = NAME, include = WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Armor.class, name = "armor"),
        @JsonSubTypes.Type(value = Capacity.class, name = "capacity"),
        @JsonSubTypes.Type(value = CarryingCapacity.class, name = "carryingCapacity"),
        @JsonSubTypes.Type(value = FirePower.class, name = "firePower"),
        @JsonSubTypes.Type(value = Fuel.class, name = "fuel"),
        @JsonSubTypes.Type(value = TypeOfFuel.class, name = "fuelType"),
        @JsonSubTypes.Type(value = CapacityOfFighters.class, name = "capacityOfFighters"),
        @JsonSubTypes.Type(value = NumberOfGuns.class, name = "numberOfGuns"),
        @JsonSubTypes.Type(value = PaintColor.class, name = "paintColor"),
        @JsonSubTypes.Type(value = ScanSensor.class, name = "scanSensor"),
        @JsonSubTypes.Type(value = ShipName.class, name = "shipName")
})
public interface Parameter {
}
