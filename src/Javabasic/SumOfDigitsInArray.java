package Javabasic;

import java.util.Arrays;

public class SumOfDigitsInArray {

    // 1 - Using normal for loop
    int getSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // 2 - Using enhanced for loop
    static int getSum1(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 8, 11, 7, 8, 9};

        // Method 1
        int ans = new SumOfDigitsInArray().getSum(arr);
        System.out.println("Sum using normal for loop: " + ans);

        // Method 2
        System.out.println("Sum using enhanced for loop: " + getSum1(arr));

        // Method 3 - Using Streams
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum using stream: " + sum);

        // Method 4 - Using Parallel Streams (for very large arrays)
        int sum1 = Arrays.stream(arr).parallel().sum();
        System.out.println("Sum using parallel stream: " + sum1);
    }
}
