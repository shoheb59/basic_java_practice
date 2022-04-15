public class ThirdHighestValue {
    public static void main(String[] args) {
        int value[] = {42, 30, 56, 63, 74,90, 86, 48};
        int max=0;
        for(int i =0; i< value.length; i++)
        {
            for(int j = i+1; j< value.length; j++)
            {
                if (value[i]>value[j])
                {
                    //System.out.println(value[i]);

                    max = value[i];
                    value[i] = value[j];
                    value[j] = max;

                }
            }

        }
        System.out.println("Third largest number is:: "+value[value.length-3]);
    }

}

