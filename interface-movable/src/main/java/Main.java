import Movable.*;

public class Main
{
    public static void main(String[] args)
    {
        IMovable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        IMovable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        try {
            IMovable m3 = new MovableRectangle(1, 2, 5, 2, 5, 6);  // upcast
            System.out.println(m3);
            m3.moveUp();
            System.out.println(m3);
            m3.moveLeft();
            System.out.println(m3);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
