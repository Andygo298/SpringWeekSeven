package com.github.andygo298.builder;

import com.github.andygo298.model.parameter.ScanSensor;
import com.github.andygo298.model.ship.SpyProbe;

public class SpyProbeBuilder extends SupportShipBuilder<SpyProbe> {

    @Override
    protected void setOtherShipParameters(SpyProbe spyProbe) {
        super.setOtherShipParameters(spyProbe);
        spyProbe.setSpyProbeType(extractValue(ScanSensor.class).getValue());
    }
}
