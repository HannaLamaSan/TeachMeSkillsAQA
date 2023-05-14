import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        getNumbInMassive();
    }
    //Conditional operators, flow manipulators
    //Task 1
    public static void getNumbInMassive()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size massive - ");
        int N = scan.nextInt(); //переменная для задания размера массива
        int[] mass = new int[N]; //создание массива размера N
        for (int i = 0; i < N; i++) {//цикл для заполнения массива (от первого жлемента, до элемента N(размер нашего масива)
            System.out.print("Enter number in massive - ");
            int a = scan.nextInt();//переменная для получения значения
            mass[i] = a;//заполение элемента с индексом i
            //(по каждому проходу массива i увеличивается на 1=> значение записывается по очереди в массиве)
        }
        int temp = 0; //переменная для записи найденного совпадения
        System.out.print("Enter number - ");
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
}


