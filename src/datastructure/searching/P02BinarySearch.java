package src.datastructure.searching;

import java.util.Arrays;

public class P02BinarySearch {
    public static void main(String[] args) {
        int [] arr={4,24,1,42,12,4};
        System.out.println(isPresentBinary(arr,42));
    }

    private static int isPresentBinary(int[] arr, int num) {
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while (start<=end){
            int mid=start+ (end-start)/2;
            if (num<arr[mid]){
                end=mid-1;
            } else if (num>arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
