package CardControl;

public class CreditCard {
    private String account;
    private double currentSum;

    public CreditCard(String account, double currentSum) {
        this.account = account;
        this.currentSum = currentSum;
    }

    public void addSum(double sum){
        this.currentSum = this.currentSum + sum;
        System.out.println("Your balance: "+ currentSum);
    }

    public void withdrawSum(double sum){
        this.currentSum = this.currentSum - sum;
        if (currentSum<0)
        {
            System.out.println("Overdraft opened! Your balance: " + currentSum);
        }else {
            System.out.println("Your balance: " + currentSum);
        }
    }

    public void printCardInformation(){
        System.out.println("Card number is: " + this.account);
        System.out.println("Sum is: " +  this.currentSum);
    }
}
