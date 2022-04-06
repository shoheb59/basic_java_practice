import java.util.Scanner;

public class Shirtshirt {
    public static void main(String[] args) {
        int shirt, sharee, totalCost, discount = 400, cost, cost1;

        System.out.println("Enter number of Shirt ");

        Scanner scanner = new Scanner(System.in);
        shirt = scanner.nextInt();

        System.out.println("Enter number of Sharee ");
        Scanner b = new Scanner(System.in);
        sharee = b.nextInt();

        if (shirt == 2 & sharee == 1) {
            cost = 2 * 1200 + 1 * 3500;
            totalCost = cost - discount;
            System.out.println("Discount price is: " + totalCost);
        } else {
            cost1 = shirt * 1200 + sharee * 3500;
            System.out.println("Total price is without discount: " + cost1);
        }
    }
}
