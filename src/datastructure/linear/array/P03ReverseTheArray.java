package src.datastructure.linear.array;

import java.util.Arrays;

public class P03ReverseTheArray {
    public static void main(String[] args) {
        int [] arr={12,45,21,8, 4,767,3};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
