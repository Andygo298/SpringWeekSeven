package com.github.andygo298.builder.factory;

import com.github.andygo298.builder.*;
import com.github.andygo298.model.ship.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceShipBuilderFactory {

    private static final Map<Class<? extends SpaceShip>, Supplier<? extends SpaceShipBuilder<?>>> BUILDERS = new HashMap<>();

    static {
        BUILDERS.put(Cruiser.class, CruiserBuilder::new);
        BUILDERS.put(Fighter.class, FighterBuilder::new);
        BUILDERS.put(DeadStar.class, DeadStarBuilder::new);
        BUILDERS.put(Transport.class, TransportBuilder::new);
        BUILDERS.put(SpyProbe.class, SpyProbeBuilder::new);
    }

    @SuppressWarnings("unchecked")
    public static <T extends SpaceShip, BUILDER extends SpaceShipBuilder<T>> BUILDER getBuilder(Class<?> clazz) {
        return (BUILDER) BUILDERS.get(clazz).get();
    }
}
