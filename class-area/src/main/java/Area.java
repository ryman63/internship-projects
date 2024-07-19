public class Area {
    static double getArea(double radius)
    {
        if(radius <= 0)
            return 0;

        double S = Math.PI * Math.pow(radius, 2);

        if(S <= 0)
            return 0;

        return Math.floor(S * 100) / 100;
    }
    static double getArea(int width, int length)
    {
        if(width <= 0 || length <= 0)
            return 0;

        double S = (double)(width * length);

        if(S <= 0)
            return 0;

        return Math.floor(S * 100) / 100;
    }
    static double getArea(double radius, double height)
    {
        if(radius <=0 || height <= 0)
            return 0;

        double S = 2 * Math.PI * radius * (height + radius);

        if(S <= 0)
            return 0;

        return Math.floor(S * 100) / 100;
    }


}
