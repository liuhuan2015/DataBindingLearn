package com.example;

/**
 * 一个一对兔子在生下来第三个月开始以后每个月都会生一对兔子的故事
 */
public class MyClass {

    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i < 20; i++) {
            System.out.println(f(i));
        }

    }

    private static int f(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return f(i - 1) + f(i - 2);
        }
    }



}
