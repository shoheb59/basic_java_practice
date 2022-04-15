public class SumAndAvg {
    public static void main(String[] args) {
        int num [] = {10, 3, 8, 7, 15, 6, 9, 16, 25, 18};
        int sum = 0, count =0, avg;

        for( int i = 0; i< num.length;i++)
        {
            if(num[i]%2 ==0 || num[i]%5==0)
            {
                count++;
                sum = num[i]+sum;

            }
        }
        System.out.println("Divisible total number: " +count);
        System.out.println("Sum of the Divisible number: "+ sum);
        avg = sum/count;
        System.out.println("Average of the Divisible number is: " +avg);
    }

}
