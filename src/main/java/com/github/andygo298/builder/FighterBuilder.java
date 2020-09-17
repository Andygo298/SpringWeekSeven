package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.FlightSpeed;
import com.github.andygo298.model.ship.Fighter;

public class FighterBuilder extends CombatShipBuilder<Fighter> {

    @Override
    protected void setOtherShipParameters(Fighter fighter) {
        super.setOtherShipParameters(fighter);
        fighter.setFlightSpeed(extractValue(FlightSpeed.class).getValue());
    }
}
