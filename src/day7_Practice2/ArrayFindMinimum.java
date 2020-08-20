package day7_Practice2;

import java.util.Arrays;

public class ArrayFindMinimum {
    /**
     * Write a method that can find the maximum number from an int Array
     */
    public static int minValue1(int []n){
        int min=Integer.MAX_VALUE;
        for (int each :n)
            if(each<min)
                min=each;
            return min;
    }
    public static int minValue2(int []n){
        Arrays.sort(n);
        return n[0];
    }

    public static void main(String[] args) {
        int[]arr={23,41,56,76,44,546,89,1,23,3};
        System.out.println(minValue1(arr));
        System.out.println(minValue2(arr));
    }
}
