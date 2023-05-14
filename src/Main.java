import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        //Task 1
        //getNumbInMassive();
        //Task 2
        //deleteNumberFromMassive();
        //Task 3
        //getMaxMin();
        //task 4
        //getAvgFromTwoMass();
    }
    //Task 1
    public static void getNumbInMassive()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size massive: ");
        int N = scan.nextInt(); //переменная для задания размера массива
        int[] mass = new int[N]; //создание массива размера N
        for (int i = 0; i < N; i++)
        {//цикл для заполнения массива (от первого жлемента, до элемента N(размер нашего масива)
            System.out.print("Enter number in massive: ");
            int a = scan.nextInt();//переменная для получения значения
            mass[i] = a;//заполение элемента с индексом i
            //(по каждому проходу массива i увеличивается на 1=> значение записывается по очереди в массиве)
        }
        int temp = 0; //переменная для записи найденного совпадения
        System.out.print("Enter number: ");
        int numb = scan.nextInt(); //искомое в массиве число
        for (int i = 0; i < mass.length; i++) {//цикл для прохождения по массиву, от 0 до размера массива(mass.length)
            if (numb == mass[i]) {//если искомое число равно значению элемента в массиве
                temp = mass[i];//то пишем в темп
            }
        }
        if(temp!=0)//если число не равно 0, то выводим сообщение что значение найдено
        {
            System.out.print("Number in array!");
        }
        else
        {
            System.out.print("Number NOT in array!");
        }
    }
    //Task 2
    public static void deleteNumberFromMassive()
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter size massive: ");
        int N = scan.nextInt(); //переменная для задания размера массива
        int[] mass = new int[N]; //создание массива размера N
        int[] mass2;
        for (int i = 0; i < N; i++) {//цикл для заполнения массива (от первого жлемента, до элемента N(размер нашего масива)
            System.out.print("Enter number in massive: ");
            int a = scan.nextInt();//переменная для получения значения
            mass[i] = a;//заполение элемента с индексом i
            //(по каждому проходу массива i увеличивается на 1=> значение записывается по очереди в массиве)
        }
        System.out.print("Enter number: ");
        int number = scan.nextInt();//удаляемое число
        int counter = 0;//если есть совпадние, пишем в счетчик
        for(int i = 0; i < mass.length; i++)//цикл для сравнивания с заданным числом
        {
            if(mass[i] == number)
            {
                counter++;//если есть то +1 в счетчик
            }
        }
        if(counter == 0)
        {
            System.out.println("This number is not found in array!");//если нет то сообщение что сопадений нет
        }
        else
        {
            System.out.print("Clean array: ");
            mass2 = new int[mass.length - counter];//новый массив без заданного числа. Длина заданного массива минус количество повторений
            for(int i = 0, k = 0; i < mass.length; i++)//старт цикла для двух массивов с первого элемента
            {
                if(mass[i] != number){//если число не совпадает с заданным, то пишем вновый массив
                    mass2[k] = mass[i];//k - длина второго массива
                    System.out.print(" " + mass2[k]);
                    k++;
                }
            }
            System.out.println();
        }
    }
    //Task 3
    public static void getMaxMin()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size massive: ");
        int N = scan.nextInt(); //переменная для задания размера массива
        int[] mass = new int[N]; //создание массива размера N
        for (int i = 0; i < N; i++)
        {//цикл для заполнения массива (от первого жлемента, до элемента N(размер нашего масива)
            mass[i] = (int) (Math.random()*99);//заполение элемента с индексом i
            //(по каждому проходу массива i увеличивается на 1=> значение записывается по очереди в массиве)
        }
        System.out.println("Your massive:");//Вывод массива
        for (int i = 0; i < N; i++)
        {
            System.out.println(mass[i]);
        }
        int maxNumb = mass[0];//для максимального значения
        int minNumb = mass[0];//для минимального значения
        double average = 0;//для среднего значения
        for (int i = 0; i < mass.length; i++)
        {
            if (maxNumb < mass[i])//если текущее значение maxNumb меньше элемента массива, то записываем значение из массива в maxNumb
                maxNumb = mass[i];
            if (minNumb > mass[i])//если текущее значение minNumb ,больше элемента массива, то записываем значение из массива в maxNumb
                minNumb = mass[i];
            average += mass[i];//плюсуем значение элемента в average что бы потом разделить на количество элементов
        }
        average /= N;//делим на количество элементов
        System.out.println("maximal number: " + maxNumb);
        System.out.println("minimal number: " + minNumb);
        System.out.println("average number: " + average);
    }
    //Task 4
    public static void getAvgFromTwoMass()
    {
        //Создадим переменные в которых будет храниться среднее арифмитическое
        double sumMass1 =0, sumMass2 =0;
        //Создадим из заполним первый массив. Выведем на экран значения его переменных.
        int[] Mass1 = new int[5];
        for(int i = 0; i< Mass1.length; i++)
        {
            Mass1[i]=(int)(Math.random()*99);
            System.out.print(Mass1[i] +" ");
            //Посчитаем и сохраним среднее арифметическое первого массива
            sumMass1 +=(double) Mass1[i]/ Mass1.length;
        }
        System.out.println(" ");
        //Аналогично первому, создадим и выведем на экран второй массив
        int[] Mass2 =new int[5];
        for(int i = 0; i< Mass2.length; i++){
            Mass2[i] =(int)(Math.random()*99);
            System.out.print(Mass2[i] +" ");
            sumMass2 +=(double) Mass2[i]/ Mass2.length;
        }
        System.out.println(" ");
        //Сравним и выведем по условию средеарифметическое какого массива больше
        if(sumMass1 == sumMass2)System.out.println("The averages of the arrays are the same!");
        else {if(sumMass1 > sumMass2)
            System.out.println("The average of first array is greater: " + sumMass1);
        else System.out.println("The average of second array is greater: " + sumMass2);
        }

    }
}


