package Shapes;

abstract class Rectangle extends Shape
{
    protected double width, height;
    @Override
    public double getArea()
    {
        if(width <= 0 || height <= 0)
            return -1;

        return width * height;
    }
    @Override
    public double getPerimeter()
    {
        if(width <= 0 || height <= 0)
            return -1;

        return 2 * (width + height);
    }
}
