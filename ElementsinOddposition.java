public class ElementsinOddposition {
    public static void main(String[] args) {

        //Initialize array
        int[] numbers = new int[]{5, 12, 16, 3, 9, 7, 1, 100, 32};

        System.out.println("Array Elements on Odd Positions: ");

        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}
