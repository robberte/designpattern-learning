package com.jockey.designpattern.learning.absfactory;

public class AbstractFactroyPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactroy("SHAPE");

        Shape circle = shapeFactory.getShape("circle");

        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");

        rectangle.draw();

        Shape square = shapeFactory.getShape("square");

        square.draw();

        AbstractFactory colorFactory =  FactoryProducer.getFactroy("COLOR");

        Color red = colorFactory.getColor("RED");

        red.fill();

        Color yellow = colorFactory.getColor("YELLOW");

        yellow.fill();

        Color green = colorFactory.getColor("GREEN");

        green.fill();
    }
}
