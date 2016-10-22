package com.gharpure;


/**
 * Created by gharpure on 10/21/16.
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
