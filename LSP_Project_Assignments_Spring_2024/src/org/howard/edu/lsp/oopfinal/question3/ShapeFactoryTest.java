package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {

    @Test
    public void testCreateCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCreateInvalidShape() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape("invalid");
        assertNull(shape);
    }
}