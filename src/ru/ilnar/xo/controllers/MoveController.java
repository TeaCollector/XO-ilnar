package ru.ilnar.xo.controllers;

import ru.ilnar.xo.model.Field;
import ru.ilnar.xo.model.Figure;
import ru.ilnar.xo.model.exceptions.AlreadyOccupiedException;
import ru.ilnar.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {
    public void applyFigure(final Field field, final Point point, final Figure figure) throws AlreadyOccupiedException, InvalidPointException {
        if (field.getFigure(point)!=null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point,figure);
    }
}
