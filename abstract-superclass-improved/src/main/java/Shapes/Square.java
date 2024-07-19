package Shapes;

public class Square extends Rectangle {
    public Square(double side)
    {
        width = side;
        height = side;
    }
    @Override
    public String toString()
    {
        return "Square\n Side: " + width + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", " + super.toString();
    }
}
