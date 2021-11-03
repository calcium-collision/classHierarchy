package com.company.calcium_collision;

public class Pyramid extends Shape {

    double s;
    double h;

    public Pyramid(double s, double h){
        super((s/3)*h);
        this.s = s;
        this.h = h;

    }
}
