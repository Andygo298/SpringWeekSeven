package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.PaintColor;
import com.github.andygo298.model.ship.SpaceShip;
import com.github.andygo298.model.ship.SupportShip;

public abstract class SupportShipBuilder<SPACE_SHIP extends SupportShip> extends SpaceShipBuilder<SPACE_SHIP> {

    @Override
    protected void setOtherShipParameters(SPACE_SHIP spaceShip) {
        spaceShip.setColorType(extractValue(PaintColor.class).getValue());
    }
}
