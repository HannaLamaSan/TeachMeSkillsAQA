package Phone;

public class Phone
{
    public int number;
    public String model;
    public int weight;
    public String name = "Archil"; // Имя звонящего
    public void receiveCall()
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int num)
    {
        System.out.println("Звонит " + name + "\n" + num);
    }

    public void getNumber()
    {
        System.out.println(number);
    }
    public void sendMessage(int num1, int num2)
    {
        System.out.println(num1 + "\n" + num2);
    }
    public Phone(int a, String b, int c)
    {
        number = a;
        model = b;
        weight = c;
        Phone ph = new Phone(1, "model");
    }

    public Phone(int a, String b)
    {
        number = a;
        model = b;
    }

    public Phone() {}
}
