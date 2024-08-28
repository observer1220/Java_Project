package Shapes;

import java.io.Serializable;

public class Circle implements Serializable {
    private double radius;
    private static final double PI = 3.14;

    public Circle() {
        this(1.0);
    }

    // Circle Class Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        } else {
            this.radius = radius;
        }
    }
}
