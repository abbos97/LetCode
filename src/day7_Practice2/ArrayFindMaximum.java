package day7_Practice2;

import java.util.Arrays;

public class ArrayFindMaximum {
    /**
     * Write a method that can find the maximum number from an int Array
     */
    public static int maxValue1(int[] n){
        int max =Integer.MIN_VALUE;
        for (int each : n)
            if(each > max)
                max=each;
            return max;
    }
    public static int maxValue2(int [] n){
        Arrays.sort(n);
        return n[n.length-1];
    }

    public static void main(String[] args) {
        int []num={23,43,12,56,78,89};
        System.out.println(maxValue1(num));
        System.out.println(maxValue2(num));
    }


}
