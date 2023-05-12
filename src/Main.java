import java.awt.*;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {

         getTimeOfYearSwitch();
        /*getTimeOfYearIfElse();

        getEvenOrOdd();*/
    }
    //Task 1
    public static void getTimeOfYearSwitch()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Task 1! Enter month number: ");
        int numMonth = scan.nextInt();
        switch (numMonth) {
            case 1 -> System.out.println("This is winter! Don't forget to wear a hat!!!");
            case 2 -> System.out.println("This is winter! Don't forget to wear a hat!!!");
            case 3 -> System.out.println("This is spring! A little more and it will be summer!!!");
            case 4 -> System.out.println("This is spring! A little more and it will be summer!!!");
            case 5 -> System.out.println("This is spring! A little more and it will be summer!!!");
            case 6 -> System.out.println("This is summer! Summer, sea, heat!!!");
            case 7 -> System.out.println("This is summer! Summer, sea, heat!!!");
            case 8 -> System.out.println("This is summer! Summer, sea, heat!!!");
            case 9 -> System.out.println("This is autumn! Rainy season and beautiful trees!!!");
            case 10 -> System.out.println("This is autumn! Rainy season and beautiful trees!!!");
            case 11 -> System.out.println("This is autumn! Rainy season and beautiful trees!!!");
            case 12 -> System.out.println("This is winter! Don't forget to wear a hat!!!");
        }
    }
    //Task 2
    public static void getTimeOfYearIfElse()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Task 2! Enter month number: ");
        int numMonth = scan.nextInt();
        if (numMonth == 1 || numMonth == 2 || numMonth == 12)
        {
            System.out.println("This is winter! Don't forget to wear a hat!!!");
        } else if (numMonth == 3 || numMonth == 4 || numMonth == 5)
        {
            System.out.println("This is spring! A little more and it will be summer!!!");
        } else if (numMonth == 6 || numMonth == 7 || numMonth == 8)
        {
            System.out.println("This is summer! Summer, sea, heat!!!");
        } else if (numMonth == 9 || numMonth == 10 || numMonth == 11)
        {
            System.out.println("This is autumn! Rainy season and beautiful trees!!!");
        }
        else
        {
            System.out.println("There are only 12 month in year!");
        }
    }
    //Task 3
    public static void getEvenOrOdd()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Task 3! Enter number: ");
        int num = scan.nextInt();
        if (num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is not even");
        }
    }
}


