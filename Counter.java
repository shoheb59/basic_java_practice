import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        int counter = 1;
        System.out.println("Press Enter for count Tasbih ");

        while(true)
        {

            Scanner readinput = new Scanner(System.in);

            String enterkey = readinput.nextLine();
            if(enterkey.equals("0")) {
                break;
            }
            else if(enterkey.equals("")) {
                System.out.print(counter++);
            }

        }



    }

}
