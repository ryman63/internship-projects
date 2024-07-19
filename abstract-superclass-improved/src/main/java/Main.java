import Shapes.*;
public class Main
{
    public static void main(String[] args)
    {
        BaseRectangle baseRectangle = new BaseRectangle(10,15);
        baseRectangle.setColor("Red");
        baseRectangle.setFilled(true);
        System.out.println(baseRectangle);

        Square square = new Square(10);
        square.setColor("Green");
        square.setFilled(false);
        System.out.println(square);

        BaseEllipse baseEllipse = new BaseEllipse(10,15);
        baseEllipse.setColor("Black");
        baseEllipse.setFilled(true);
        System.out.println(baseEllipse);

        Circle circle = new Circle(10);
        circle.setColor("Yellow");
        circle.setFilled(false);
        System.out.println(circle);
    }
}
