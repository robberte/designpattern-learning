package com.jockey.designpattern.learning.absfactory;

public class FactoryProducer {

    public static AbstractFactory getFactroy(String choise) {
        if("SHAPE".equalsIgnoreCase(choise)) {
            return new ShapeFactory();
        } else if("COLOR".equalsIgnoreCase(choise)) {
            return new ColorFactory();
        }
        return null;
    }
}
