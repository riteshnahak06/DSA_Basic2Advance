package src.datastructure.linear.array;

import java.util.Arrays;

public class P01SwapArrayValueAtIndexes {
    public static void main(String[] args) {
        int [] arr={3,51,45,14,6};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
