// Filename: Rectangle.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. IllegalArgumentException. Java Platform, https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/IllegalArgumentException.html
// Java Standard Edition Documentation. Class Rectangle. https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Rectangle.html

public class Rectangle {
    // Default length and width for each new rectangle
    private double length = 1.0; 
    private double width = 1.0;

    // Get the length of the rectangle
    public double getLength() {
        return length;
    }

    // Set the length of the rectangle. Range (0.0, 20.0).
    public void setLength(double length) {
        if(length <= 0.0 || length >= 20.0) {
            throw new IllegalArgumentException("Length must be in the range (0.0, 20.0)");
        }
        this.length = length;
    }

    // Get the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Set the width of the rectangle. Valid range (0.0, 20.0).
    public void setWidth(double width) {
        if(width <= 0.0 || width >= 20.0) {
            throw new IllegalArgumentException("Width must be in the range (0.0, 20.0)");
        }
        this.width = width;
    }

    // Calculate the area of the rectangle by multiplying length by width
    public double calculateArea() {
        return length * width;
    }

    // Calculate the perimeter of the rectangle by adding length and width and then multiplying by 2
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
