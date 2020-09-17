package com.github.andygo298.enums;

import com.github.andygo298.model.ship.*;
import lombok.Getter;

@Getter
public enum ShipType {
    CRUISER(Cruiser.class),
    FIGHTER(Fighter.class),
    DEAD_STAR(DeadStar.class),
    TRANSPORT(Transport.class),
    SPY_PROBE(SpyProbe.class);

    private Class<? extends SpaceShip> spaceShipClass;

    ShipType(Class<? extends SpaceShip> spaceShipClass) {
        this.spaceShipClass = spaceShipClass;
    }
}
