package src.datastructure.searching;

public class P01LinearSearch {
    public static void main(String[] args) {
        int [] arr={4,24,1,42,12,4};
        System.out.println(isPresent(arr,4));
    }

    private static boolean isPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
