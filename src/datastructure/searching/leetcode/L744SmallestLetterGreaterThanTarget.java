package src.datastructure.searching.leetcode;
/*
You are given an array of characters letters that is sorted in non-decreasing order,
and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.--> This is ceiling but equal is excluded
If such a character does not exist, return the first character in letters.
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

 */
public class L744SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] chars={'x','x','y','y'};
        System.out.println(nextGreatestLetter(chars,'z'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start+ (end- start)/2;
            if (target>letters[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
            // no equal condition as it mentioned greater than target
        }
        //if nothing there return the first index value
        return letters[start%letters.length];

    }

}
