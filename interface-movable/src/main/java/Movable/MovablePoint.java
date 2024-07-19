package Movable;

import Movable.IMovable;
public class MovablePoint implements IMovable
{
    int x, y;
    int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return "Movable.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp()
    {
        y += ySpeed;
    }

    @Override
    public void moveDown()
    {
        y -= ySpeed;
    }

    @Override
    public void moveLeft()
    {
        x += xSpeed;
    }

    @Override
    public void moveRight()
    {
        x -= xSpeed;
    }
}
