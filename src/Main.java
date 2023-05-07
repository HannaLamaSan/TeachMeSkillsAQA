import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task 1:");
        getPersonalInfo();
        System.out.println("Task 2:");
        doTransformation();
        System.out.println("Task 3:");
        calcBMI();
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
        int weight = enter.nextInt();
        //Выводим полученные данные
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        //Не закрываю сканер т.к ошибка. Не совсем понятно почему но есть предположение что если он закрылся
       //enter.close();
    }
    //Task 2
    //В классе Scanner нету метода для считывания char. Можно использовать InputStreamReader,
    // но мы еще такое не проходили:)
    public static void doTransformation()
    {
        char myChar1 = 'C';
        System.out.println(myChar1 + (int) myChar1);
        char myChar2 = 'a';
        System.out.println(myChar2 + (int) myChar2);
    }
    //Task 3
    public static void calcBMI()
    {
        Scanner enter2 = new Scanner(System.in);
        System.out.print("Please, enter your weight: ");
        float weightBMI = enter2.nextFloat();
        System.out.print("Enter your height in meters: ");
        float heightBMI = enter2.nextFloat();
        float BMI = weightBMI/(heightBMI*heightBMI);
        System.out.printf("%.1f", BMI);
        enter2.close();
    }

}
