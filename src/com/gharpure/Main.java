package com.gharpure;


/**
 * Created by gharpure on 10/21/16.
 * This is the main program where we create an array of shapes
 * Then add a rectangle, a square and a circle
 * We also print the number of Rectangles that were created via the static method getNumRectangles
 * Then we loop over all the shapes and call the methods defined in the interface
 */
public class Main {
    public static void main(String[] args) {
        Shape theShapes[] = new Shape[3];
        theShapes[0] = new Rectangle(3.0f, 5.0f);
        theShapes[1] = new Square(10.0f);
        theShapes[2] = new Circle(5.0f);
        System.out.println("Rectangles Created " + Rectangle.getNumRectangles());

        for (Shape s : theShapes) {
            System.out.println(s.getArea());
            System.out.println(s.getPerimeter());
            s.printMe();
/*            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                r.printMe();
            } else if (s instanceof Circle) {
                Circle c = (Circle)s;
                c.printMe();
            }  */
        }

    }
}
