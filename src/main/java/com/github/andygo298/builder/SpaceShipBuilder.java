package com.github.andygo298.builder;

import com.github.andygo298.enums.FuelType;
import com.github.andygo298.model.parameter.*;
import com.github.andygo298.model.ship.SpaceShip;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.core.GenericTypeResolver;

import java.util.List;

public abstract class SpaceShipBuilder<SPACE_SHIP extends SpaceShip> {

    private List<Parameter> shipParameters;

    public SPACE_SHIP build() {
        SPACE_SHIP spaceShip = createEmptyShip();
        spaceShip.setShipName(extractValue(ShipName.class).getValue());
        spaceShip.setArmor(extractValue(Armor.class).getValue());
        spaceShip.setFuel(extractValue(Fuel.class).getValue());
        spaceShip.setFuelType(extractValue(TypeOfFuel.class).getValue());
        setOtherShipParameters(spaceShip);
        return spaceShip;
    }

    public SpaceShipBuilder<SPACE_SHIP> setParameters(List<Parameter> shipParameters){
        this.shipParameters = shipParameters;
        return this;
    }

    protected abstract void setOtherShipParameters(SPACE_SHIP spaceShip);

    @SuppressWarnings("unchecked")
    public <T extends Parameter> T extractValue(Class<T> clazz){
        return (T) shipParameters.stream()
                .filter(item -> item.getClass() == clazz)
                .findFirst()
                .orElse(null);
    }

    @SuppressWarnings("unchecked")
    public SPACE_SHIP createEmptyShip() {
        Class<?> clazz = GenericTypeResolver.resolveTypeArgument(this.getClass(), SpaceShipBuilder.class);
        return (SPACE_SHIP) ReflectUtils.newInstance(clazz);
    }
}
