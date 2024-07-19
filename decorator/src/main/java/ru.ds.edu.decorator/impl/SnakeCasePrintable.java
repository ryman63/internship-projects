package ru.ds.edu.decorator.impl;

import ru.ds.edu.decorator.Printable;
import ru.ds.edu.decorator.dec.AbstractPrintableDecorator;

public class SnakeCasePrintable extends AbstractPrintableDecorator
{

    public SnakeCasePrintable(Printable obj) {
        super(obj);
    }

    private String convertCamelToSnake(String input) {
        String regex = "([a-zA-Zа-яА-Я])([A-ZА-Я]+)";
        String replacement = "$1_$2";
        return input.replaceAll(regex, replacement).toLowerCase();
    }

    @Override
    public String getMessage()
    {
        return convertCamelToSnake(super.getMessage());
    }
}
