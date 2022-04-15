import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int prime =  primeNum(num);
        System.out.println(prime +" number is checked");
        boolean flag = false;

    }
    static int primeNum(int x)
    {
        boolean flag = false;
        for (int i = 2; i < x/2; i++)
        {
            if (x%i == 0)
            {
                System.out.println("Not a Prime Number");
                flag = true;
                break;



            }

        }
        if(flag == false)
        {
            System.out.println("Prime Number");
        }




        return x;

    }


}
