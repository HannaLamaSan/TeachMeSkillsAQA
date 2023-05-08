import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task 1:");
       // getPersonalInfo();
        System.out.println("Task 2:");
        doTransformation();
        System.out.println("Task 3:");
        // calcBMI();
    }
    //Task 1
    public static void getPersonalInfo()
    {
        Scanner enter = new Scanner(System.in);
        //Считываем имя
        System.out.print("Please, enter your name: ");
        String name = enter.nextLine();
        //Считываем фамилию
        System.out.print("Please, enter your surname: ");
        String surname = enter.nextLine();
        //Считывем возраст
        System.out.print("Please, enter your age: ");
        int age = enter.nextInt();
        //Считываем рост
        System.out.print("Please, enter your height: ");
        int height = enter.nextInt();
        //Считываем вес
        System.out.print("Please, enter your weight: ");
        double weight = enter.nextDouble();
        //Выводим полученные данные
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        //Не закрываю сканер т.к ошибка. Не совсем понятно почему.
       //enter.close();
    }
    //Task 2
    //В классе Scanner нету метода для считывания char. Можно использовать наверное InputStreamReader,
    // но мы еще такое не проходили:)
    public static void doTransformation()
    {
        char mySymbolC = 'C';
        char mySymbolA = 'a';

        System.out.println(mySymbolC + " - " + (int) mySymbolC); // преобразование типов (тип) _переменная
        System.out.println(mySymbolA + " - " + (int) mySymbolA);

    }
    //Task 3
    public static void calcBMI()
    {
        Scanner enter2 = new Scanner(System.in);
        System.out.print("Please, enter your weight: ");
        float weightBMI = enter2.nextFloat();
        System.out.print("Enter your height: ");
        float heightBMI = enter2.nextFloat();
        double BMI = weightBMI/((heightBMI/100)*(heightBMI/100));
        System.out.printf("%.1f", BMI);
        enter2.close();
    }
}
