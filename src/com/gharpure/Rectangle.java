package com.gharpure;

/**
 * Created by gharpure on 10/21/16.
 */
public class Rectangle implements Shape {
    private static int numRectangles = 0;
    public static int getNumRectangles() {
        return numRectangles;
    }
    float width;
    float height;
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        numRectangles++;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }

    float getWidth() {
        return width;
    }

    float getHeight() {
        return height;
    }

    public void printMe() {
        System.out.println("Rectangle (" + width + " x " + height + ")");
    }
}
