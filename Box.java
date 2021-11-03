package com.company.calcium_collision;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape){
        if (getVolume() - shape.getVolume() < 0){
            return false;
        } else {
            volume -= shape.getVolume();
            shapes.add(shape);
            return true;
        }
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
