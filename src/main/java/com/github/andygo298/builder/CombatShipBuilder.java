package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.FirePower;
import com.github.andygo298.model.ship.CombatShip;

public abstract class CombatShipBuilder<SPACE_SHIP extends CombatShip> extends SpaceShipBuilder<SPACE_SHIP> {

    @Override
    protected void setOtherShipParameters(SPACE_SHIP spaceShip) {
        spaceShip.setFirePower(extractValue(FirePower.class).getValue());
    }
}
