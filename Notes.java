import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        int notes[] ={1000,500,100,50,20,10,5, 2, 1};
        System.out.println("Enter Your Number: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        for(int i =0; i< notes.length; i++)
        {
            System.out.println("notes is: " + notes[i] + ": " +amount/notes[i]);
            amount=amount%notes[i];
        }

    }
}
