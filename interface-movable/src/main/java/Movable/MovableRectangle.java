package Movable;
public class MovableRectangle implements IMovable
{
    MovablePoint topLeft, bottomRight;  // угловые точки

    public MovableRectangle(int x1, int x2,
                            int y1, int y2,
                            int xSpeed, int ySpeed) throws Exception {
        if(y1 > y2 && x1 < x2)
        {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }
        else
            throw new Exception("Координаты точек не соответствуют прямоугольнику");
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
