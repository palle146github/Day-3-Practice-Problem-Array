public class AscendingOrder {
    public static void main(String[] args)
    {
        int temp;
        int a[] = new int[]{4, 9, 5, 1, 12, 94, 18, 16};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
