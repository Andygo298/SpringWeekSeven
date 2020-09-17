package com.github.andygo298.model.parameter;

import com.github.andygo298.enums.SpyProbeType;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ScanSensor extends ParameterBase<SpyProbeType> {

    public ScanSensor(SpyProbeType value) {
        super(value);
    }
}
