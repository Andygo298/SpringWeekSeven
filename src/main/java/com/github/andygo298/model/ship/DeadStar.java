package com.github.andygo298.model.ship;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DeadStar extends CombatShip {

    private Integer maxCapacityOfFighters;
}
