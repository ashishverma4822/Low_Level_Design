package com.main;

import com.factory.ShapeFactory;
import com.shapes.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //Create a circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //Create a Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //Create a Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}

