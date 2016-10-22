package com.gharpure;

/**
 * Created by gharpure on 10/21/16.
 * Square inherits from Rectangle and because Rectangle implements everything, doesn't need to implement anything.
 * However Square has to implement the constructor method which forces creation with only the length of one side.
 * It then calls the Rectangle constructor via super and passes the length of the side (s) as both width and height
 */
public class Square extends Rectangle {
    public Square(float s) {
        super(s, s);
    }
}
