public class DuplicateValue {
    public static void main(String[] args) {
        int arr [] = {10, 5, 6, 6, 7, 8, 9, 9, 3, 1, 0, 0};

        for (int i = 1; i< arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("Number Array Index is "+ i + " AND Duplicate number is: " +arr[i]);
                }

            }
        }
    }
}
