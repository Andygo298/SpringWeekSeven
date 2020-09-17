package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.NumberOfGuns;
import com.github.andygo298.model.ship.Cruiser;

public class CruiserBuilder extends CombatShipBuilder<Cruiser> {

    @Override
    protected void setOtherShipParameters(Cruiser cruiser) {
        super.setOtherShipParameters(cruiser);
        cruiser.setNumOfGuns(extractValue(NumberOfGuns.class).getValue());
    }
}
