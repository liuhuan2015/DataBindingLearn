package com.example;

import java.util.Arrays;

/**
 * Created by huan on 2017/11/9 19:36.
 */

public class Paixu {

    //从小到大排序
    public static void main(String[] args) {
        int[] intArray = {3, 7, 9, 2, 100, 55, 44, 33, 77, 32};
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                int temp;
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
