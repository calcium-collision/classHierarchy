package com.company.calcium_collision;

public class Cylinder extends SolidOfRevolution{

    double height;

    public Cylinder(double radius, double height){
        super(radius, height);
        this.height = height;
    }
}
