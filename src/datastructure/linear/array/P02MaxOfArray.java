package src.datastructure.linear.array;

public class P02MaxOfArray {
    public static void main(String[] args) {
        int [] arr={23,144,13,56,14};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
