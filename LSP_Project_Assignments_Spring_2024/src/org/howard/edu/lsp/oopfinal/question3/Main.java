package org.howard.edu.lsp.oopfinal.question3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        if (circle != null) {
            circle.draw();
        } else {
            System.out.println("Invalid shape type!");
        }
        
        Shape rectangle = factory.createShape("rectangle");
        if (rectangle != null) {
            rectangle.draw();
        } else {
            System.out.println("Invalid shape type!");
        }
    }
}