package com.github.andygo298.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.andygo298.builder.factory.SpaceShipBuilderFactory;
import com.github.andygo298.enums.FuelType;
import com.github.andygo298.enums.ShipType;
import com.github.andygo298.model.parameter.*;
import com.github.andygo298.model.ship.DeadStar;
import com.github.andygo298.model.ship.SpaceShip;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShipDtoTest {

    @Test
    public void testConvertTo() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ShipDto shipDto = new ShipDto();
        shipDto.setType(ShipType.DEAD_STAR);
        shipDto.setParameters(getDeadStarParameters());

        String s = objectMapper.writeValueAsString(shipDto);
        assertNotNull(s);
    }

    @Test
    public void testConvertFrom() throws IOException {
        String value = "{\"type\":\"DEAD_STAR\",\"parameters\":[" +
                "{\"shipName\":{\"value\":\"Dead father\"}}," +
                "{\"fuel\":{\"value\":520}}," +
                "{\"fuelType\":{\"value\":\"PETROL\"}}," +
                "{\"firePower\":{\"value\":650}}," +
                "{\"capacityOfFighters\":{\"value\":32}}," +
                "{\"armor\":{\"value\":1000}}" +
                "]}";
        ObjectMapper objectMapper = new ObjectMapper();
        ShipDto shipDto = objectMapper.readValue(value, ShipDto.class);
        assertNotNull(shipDto);
    }

    @Test
    public void testBuilder() {
        SpaceShip build = SpaceShipBuilderFactory.getBuilder(DeadStar.class)
                .setParameters(getDeadStarParameters())
                .build();
        assertNotNull(build);
    }

    private List<Parameter> getDeadStarParameters() {
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(new ShipName("Dead father"));
        parameters.add(new Fuel(520));
        parameters.add(new TypeOfFuel(FuelType.PETROL));
        parameters.add(new FirePower(650));
        parameters.add(new CapacityOfFighters(32));
        parameters.add(new Armor(1000));

        return parameters;
    }
}