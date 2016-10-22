package com.gharpure;

/**
 * Created by gharpure on 10/21/16.
 * Rectangle implements Shape and so MUST implement getArea, getPerimeter and printMe
 * In addition it also implements an accessor for the width and the height.
 *
 * We implement a static integer called numRectangles.  A static variable is created once and then shared for the
 * entire class.  We increment the numRectangles in the constructor.
 *
 * Data Encapsulation:  We tried making numRectangles public, but soon realized that a bad programmer could assign a
 * garbage value to the variable and ruin our efforts to count the number of created rectangles.
 * So we then made is private.
 * But then we could not print it.
 * So we provided an accessor function getNumRectangles to be able to read the value.
 *
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
