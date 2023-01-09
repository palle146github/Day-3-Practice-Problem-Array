public class ElementsinReverse {

    //Loop through the array
    public static void main(String[] args) {
        int [] arr = new int [] {25, 11, 7, 75, 56};
        System.out.println("Elements in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
