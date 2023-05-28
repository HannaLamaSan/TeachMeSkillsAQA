//Task1

//Task 2
import Employee.Director;
import Employee.Worker;
import Employee.Employee;
import Employee.Accountant;
import Figures.Circle;
import Figures.Figure;
import Figures.Rectangle;
import Figures.Triangle;

class Main
{
    public static void main(String[] args)
    {
        //Task 1
        calcPerimeters();
        //Task 2
        //printPositions();
    }
    private static void calcPerimeters()
    {
        Figure[] array = {
                new Circle("Circle", 5),
                new Circle("Circle", 32),
                new Triangle("Triangle", 23,10,23),
                new Triangle("Triangle", 34,18,9),
                new Rectangle("Rectangle", 30, 40)
        };

        System.out.printf("Sum of perimeters: " + getPerimeters(array));
    }

    private static double getPerimeters(Figure[] mFigureArray)
    {
        double perimeter = 0;
        for(int i = 0; i < mFigureArray.length; i++) {
            perimeter = perimeter + mFigureArray[i].getPerimeter();
        }
        return perimeter;
    }
    private static void printPositions(){

        Employee worker = new Worker();
        System.out.println(worker.getPositions());
        Employee accountant = new Accountant();
        System.out.println(accountant.getPositions());
        Employee director = new Director();
        System.out.println(director.getPositions());
    }
}


