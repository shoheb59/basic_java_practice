import java.util.Scanner;

public class Hpprice {
    public static void main(String[] args) {
        int price = 76000;
        int cash,discount,purchase,tap;

        System.out.println("Tap 1 for cash or Tap 2 for online payment: ");

        Scanner a = new Scanner(System.in);
        tap = a.nextInt();

        if(tap == 1)
        {
            discount = (price * 10 )/100;
            purchase = price - discount;
            System.out.println("Discount price is: " +discount);
            System.out.println("Purchase Price is: " +purchase);
        }
        else
        {
            System.out.println("No discount! You have to Pay: " +price);
        }


    }

}
