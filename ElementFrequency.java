public class ElementFrequency {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array fr will store frequencies of element
        int [] frequency = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    frequency[j] = visited;
                }
            }
            if(frequency[i] != visited)
                frequency[i] = count;
        }
        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);
        }
        System.out.println("----------------------------------------");
    }
}
