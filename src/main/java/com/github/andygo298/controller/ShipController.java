package com.github.andygo298.controller;

import com.github.andygo298.dto.ShipDto;
import com.github.andygo298.model.ship.SpaceShip;
import com.github.andygo298.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping("/api/v1/ship/factory")
public class ShipController {

    private final ShipService shipService;

    @Autowired
    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }

    @PostMapping(value = "/build", consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public SpaceShip buildSheep(@RequestBody ShipDto shipDto) {
        return shipService.buildSpaceShip(shipDto);
    }
}
