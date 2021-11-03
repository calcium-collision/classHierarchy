package com.company.calcium_collision;

public class SolidOfRevolution extends Shape{
    double radius;

    public SolidOfRevolution(double radius){ // shape ball
        super(((Math.PI/3)*4)*Math.pow(radius, 3));
        this.radius = radius;
    }

    public SolidOfRevolution(double radius, double height){ // shape cylinder
        super(Math.PI * Math.pow(radius, 2) * height);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
