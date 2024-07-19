package Shapes;

public class BaseRectangle extends Rectangle
{
    public BaseRectangle(double width, double height)
    {

        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle\n Width: " + width + ", Height: " + height + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", " + super.toString();
    }
}