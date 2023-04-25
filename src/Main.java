/* Example of multiline comment
.........／＞　 フ.....................
　　　　　| 　_　 _|
　 　　　／`ミ _x 彡
　　 　 /　　　 　 |
　　　 /　 ヽ　　 ﾉ
　／￣|　　 |　|　|
　| (￣ヽ＿_ヽ_)_)
　＼二つ
 */

import java.util.Scanner;

// Главная реализация моего объекта это Класс
class Main
{
    public static void main(String[] args)
    {
        // Этот код выводит сообщение, one-line comment
        // Legacy Code - код написанный другим программистом и скорее всего
        // на старой версии языка
        // Java - это чаще всего 1.8 (Java 8)

        System.out.print("O, HI!!!");
        System.out.println();

        // new line - symbol, \n

        System.out.print("My name is: " + "Hanna Behanskaya)");


        System.out.println("I am " + (20 + 4) + " years old.");
        System.out.println("Hanna" + " " + "Behanskaya" +
                ". Welcome to my First " +
                "Lesson Java in Teach Me Skills!");

        // This is an example comment for Git
        System.out.println();
        System.out.print("Please, enter your name & surname: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();


        String name = "123";
        int age = 34;
        double weight = 88.1;
        char symbol = 'A';
    }
}