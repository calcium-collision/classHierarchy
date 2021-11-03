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
