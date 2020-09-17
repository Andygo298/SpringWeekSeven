package com.github.andygo298.model.parameter;

import com.github.andygo298.enums.ColorType;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PaintColor extends ParameterBase<ColorType> {

    public PaintColor(ColorType value) {
        super(value);
    }
}
