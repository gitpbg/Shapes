package com.gharpure;

/**
 * Created by gharpure on 10/21/16.
 * This is the Shape interface
 * It defines 3 methods
 *     getArea to get the area of the shape
 *     getPerimeter to get the perimeter of the shape
 *     printMe which prints the details of the shape
 */

public interface Shape {
    float getArea();
    float getPerimeter();
    void printMe();
}
