import CardControl.CreditCard;

class Main
{
    public static void main(String[] args)
    {
        CreditCard myCard = new CreditCard("9843 2324 4498 0844",1000);//создаю экземпляры класса, параметры=параметрам в конструкторе
        CreditCard husbandCard = new CreditCard("4021 4234 4232 0981",32332);
        CreditCard daughterCard = new CreditCard("2342 3920 2043 7341",20);//на мороженое

        myCard.addSum(340);
        husbandCard.withdrawSum(340);
        daughterCard.withdrawSum(39);

        myCard.printCardInformation();
        husbandCard.printCardInformation();
        daughterCard.printCardInformation();
    }

}


