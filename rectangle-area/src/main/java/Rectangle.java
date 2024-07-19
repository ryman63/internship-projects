public class Rectangle {
    private double x1,x2,y1,y2;

    public Rectangle(double x1, double x2, double y1, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double Square()
    {
        return Math.abs(this.x2 - this.x1) * Math.abs(this.y2 - this.y1);
    }
}
