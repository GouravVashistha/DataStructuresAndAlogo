package Javabasic;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 500000000L;

        // time complexity is higher  orcer or n
//        long start1 = System.nanoTime();
//        int sum = 0;
//        for(int i = 1; i <= n ;i++){
//             sum = sum + i;
//        }
//        long end1 = System.nanoTime();
//        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
//        System.out.println("Loop time: " + (end1 - start1) / 1_000_000.0 + " ms");


        // without loop
        // now time complexity is order of 1
        long start1 = System.nanoTime();
        long sum  = n * (n + 1) / 2;
        long end1 = System.nanoTime();
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        System.out.println("formula time: " + (end1 - start1) / 1_000_000.0 + " ms");

        // faster than above it us Binary shift method
        long start3 = System.nanoTime();
        long sum3 = (n * (n + 1)) >> 1;
        long end3 = System.nanoTime();
        System.out.println("Binary shift sum = " + sum3);
        System.out.println("Binary shift time: " + (end3 - start3) / 1_000_000.0 + " ms");
    }
}
