package src.datastructure.searching;
//floor- greatest  element in array <= target
public class P04FloorOfNumber {
    public static void main(String[] args) {
        int [] arr={2,3,5,6,88,975,1134};
        System.out.println(floor(arr,1000));
    }

    private static int floor(int[] arr, int num) {
        int start=0;
        int end =arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (num<arr[mid]){
                end=mid-1;
            } else if (num>arr[mid]) {
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        // if value is not there then return the ceiling i.e. smallest value that is >= target
        return arr[end];
    }
}
