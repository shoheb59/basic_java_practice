import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int prime =  primeNum(num);
        System.out.println(prime +" number is checked");

    }
    static int primeNum(int x)
    {
        for (int i = 2; i < x; i++)
        {
            if (x%i == 0)
            {
                System.out.println("Not a Prime Number");
                break;
            }
            else
           {
                System.out.println("Prime number");
                break;
            }
        }

        return x;

    }


}
