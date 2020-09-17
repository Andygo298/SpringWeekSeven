package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.CarryingCapacity;
import com.github.andygo298.model.ship.Transport;

public class TransportBuilder extends SupportShipBuilder<Transport> {

    @Override
    protected void setOtherShipParameters(Transport transport) {
        super.setOtherShipParameters(transport);
        transport.setCarryingCapacity(extractValue(CarryingCapacity.class).getValue());
    }
}
