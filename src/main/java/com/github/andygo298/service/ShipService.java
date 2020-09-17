package com.github.andygo298.service;

import com.github.andygo298.builder.factory.SpaceShipBuilderFactory;
import com.github.andygo298.dto.ShipDto;
import com.github.andygo298.model.ship.SpaceShip;
import org.springframework.stereotype.Service;

@Service
public class ShipService {

    public SpaceShip buildSpaceShip(ShipDto shipDto){
        return SpaceShipBuilderFactory.getBuilder(shipDto.getType().getClass())
                .setParameters(shipDto.getParameters())
                .build();
    }
}
