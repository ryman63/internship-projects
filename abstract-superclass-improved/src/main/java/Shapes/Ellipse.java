package Shapes;

abstract class Ellipse extends Shape
{
    protected double r1, r2;

    @Override
    public double getArea()
    {
        if(r1 <= 0 || r2 <= 0)
            return -1;

        return Math.PI * r1 * r2;
    }

    @Override
    public double getPerimeter()
    {
        if(r1 <= 0 || r2 <= 0)
            return -1;

        return Math.PI * (3 * (r1 + r2) - Math.sqrt((3 * r1 + r2) * (r1 + 3 * r2)));
    }
}
