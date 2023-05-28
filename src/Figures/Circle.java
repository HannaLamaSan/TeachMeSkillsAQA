package Figures;

public class Circle extends Figure
{
    private double rad;
    public Circle (String figureName, int rad)
    {
        super(figureName);
        this.rad=rad;

    }
    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(rad,2);
    }
    @Override
    public double getPerimeter()
    {
        return  2 * Math.PI * rad;
    }
    public double getRadius()
    {
        return rad;
    }
    public void setRadius(double radius)
    {
        this.rad = rad;
    }
}
