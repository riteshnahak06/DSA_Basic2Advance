package src.datastructure.interview;

import java.util.Arrays;
/*
        int [] arr={4,6,3,3,4,6,3,6,6,6,6,4,3,3,6};
        op-[4, 4, 4, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6]
 */

public class SortAsPerRequirement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 3, 4, 6, 3, 6, 6, 6, 6, 4, 3, 3, 6};
        
        // Counters for 4, 3, and 6
        int count4 = 0, count3 = 0, count6 = 0;

        // Count the occurrences of each number
        for (int num : arr) {
            switch (num) {
                case 4: count4++; break;
                case 3: count3++; break;
                case 6: count6++; break;
            }
        }

        //index is the pointer through which u increase index
        int index = 0;
        for (int i = 0; i < count4; i++) {
            arr[index++] = 4;
        }
        for (int i = 0; i < count3; i++) {
            arr[index++] = 3;
        }
        for (int i = 0; i < count6; i++) {
            arr[index++] = 6;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
