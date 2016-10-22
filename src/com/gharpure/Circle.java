package com.gharpure;


/**
 * Created by gharpure on 10/21/16.
 * Circle is NOT a Rectangle but a Shape so it has to implement its set of interface methods
 * It also needs a Constructor that takes the radius as a parameter.
 * It also implements an acccessor for the radius and a specialization for getDiameter.
 */
public class Circle implements Shape {
    float radius;

    Circle(float r) {
        radius = r;
    }

    float getRadius() {
        return radius;
    }

    float getDiameter() {
        return 2.0f*radius;
    }

    @Override
    public float getArea() {
        float area = (float)(Math.PI * radius * radius);
        return area;
    }

    public float getPerimeter() {
        return (float)(2.0 * Math.PI * radius);
    }

    public void printMe() {
        System.out.println("Circle Radius = " + radius);
    }
}
