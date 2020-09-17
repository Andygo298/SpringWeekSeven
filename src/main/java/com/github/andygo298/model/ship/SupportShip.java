package com.github.andygo298.model.ship;

import com.github.andygo298.enums.ColorType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class SupportShip extends SpaceShip {

    private ColorType colorType;

}
