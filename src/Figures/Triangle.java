package Figures;

public class Triangle extends Figure{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String figureName, double sideA, double sideB, double sideC)
    {
        super(figureName);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea()
    {
        double halfPerimeter = (sideA + sideB + sideC) / 2;  // полупериметр
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public double getPerimeter()
    {
        return sideA + sideB + sideC;
    }
}
