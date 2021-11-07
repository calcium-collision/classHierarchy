package com.company.calcium_collision;

public class Main {

    public static void main(String[] args) {
//        Box box = new Box(100);
        Cylinder c = new Cylinder(2, 8); // 33.33
        Ball b = new Ball(2); // 33.51
        Pyramid p = new Pyramid(6,10); // 20
        System.out.printf("Cylinder volume is: %.2f\n" +
                          "Ball volume is: %.2f\n" +
                          "Pyramid volume is: %.2f\n",
                c.volume, b.volume, p.volume);

        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylinder)); // ok
        System.out.println(box.add(pyramid)); // failed
    }

}

/*

public class Main {

    public static void main(String[] args) {
//        Box box = new Box(100);
        Cylinder c = new Cylinder(2, 8); // 33.33
        Ball b = new Ball(2); // 33.51
        Pyramid p = new Pyramid(6,10); // 20
        System.out.printf("Cylinder volume is: %.2f\n" +
                          "Ball volume is: %.2f\n" +
                          "Pyramid volume is: %.2f\n",
                c.volume, b.volume, p.volume);

        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylinder)); // ok
        System.out.println(box.add(pyramid)); // failed
    }

}

public class Shape {

    double volume;

    public Shape(double volume){
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

public class Pyramid extends Shape {

    double s;
    double h;

    public Pyramid(double s, double h){
        super((s/3)*h);
        this.s = s;
        this.h = h;

    }
}

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

public class Cylinder extends SolidOfRevolution{

    double height;

    public Cylinder(double radius, double height){
        super(radius, height);
        this.height = height;
    }
}

public class Ball extends SolidOfRevolution{
    public Ball(double radius){
        super(radius);
    }
}


 */
