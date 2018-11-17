package com.jockey.designpattern.learning.absfactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null) {
            return null;
        }

        if("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if("YELLOW".equalsIgnoreCase(color)) {
            return new Yellow();
        } else if("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
