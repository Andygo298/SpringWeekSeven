package com.github.andygo298.model.ship;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.andygo298.enums.SpyProbeType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SpyProbe extends SupportShip {

    private SpyProbeType spyProbeType;
}
