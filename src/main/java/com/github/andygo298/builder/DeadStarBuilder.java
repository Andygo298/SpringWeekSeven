package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.CapacityOfFighters;
import com.github.andygo298.model.ship.DeadStar;

public class DeadStarBuilder extends CombatShipBuilder<DeadStar> {
    @Override
    protected void setOtherShipParameters(DeadStar deadStar) {
        super.setOtherShipParameters(deadStar);
        deadStar.setMaxCapacityOfFighters(extractValue(CapacityOfFighters.class).getValue());
    }
}
