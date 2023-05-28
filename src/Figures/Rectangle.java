package Figures;

public class Rectangle extends Figure
{
    double sideA;
    double sideB;
  public Rectangle(String figureName, double sideA, double sideB)
  {
        super(figureName);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double getSideA()
    {
        return sideA;
    }
    public void setSideA(double sideA)
    {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB)
    {
        this.sideB = sideB;
    }
    @Override
    public double getArea()
    {
        return sideA * sideB;
    }
    @Override
    public double getPerimeter()
    {
        return  2 * (sideA + sideB);
    }

}
