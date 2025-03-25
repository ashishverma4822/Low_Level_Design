package com.factory;

import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Shape;
import com.shapes.Square;

public class ShapeFactory {
    // Factory method to return a Shape object based on input type
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
