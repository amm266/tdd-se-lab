import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClass {
    @Test
    void CalculateRectangleArea(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(20);
        assertEquals(600, rectangle.calculateArea());
    }
    @Test
    void CalculateSquareArea(){
        Square square = new Square();
        square.setLength(20);
        assertEquals(400, square.calculateArea());
    }
}