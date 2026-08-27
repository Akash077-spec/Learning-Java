package Array;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 40, 55, 70 };

        int target = 40;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index : " + i);
                break;
            }

        }
    }
}
