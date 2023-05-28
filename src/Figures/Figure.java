package Figures;

public abstract class Figure
{
    private String figureName;
    private double figurePerimeter;
    private double figureArea;
    public Figure(String figureName)
    {
        this.figureName = figureName;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getShapeName()
    {
        return figureName;
    }
    public void setFigureName(String shapeName)
    {
        this.figureName = shapeName;
    }
    public double getFigurePerimeter()
    {
        return figurePerimeter;
    }
    public double getSFigureArea()
    {
        return figureArea;
    }
}
