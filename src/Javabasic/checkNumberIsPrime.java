package Javabasic;

import java.math.BigInteger;

public class checkNumberIsPrime {

    // Naive method (O(n))
    static boolean isPrimeNaive(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Optimized method (O(√n), 6k ± 1)
    static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 20; // <-- Yaha number change karke test kar sakte ho

        // Naive method
        System.out.println("Naive method: " + isPrimeNaive(number));

        // Optimized method
        System.out.println("Optimized method (6k±1): " + isPrimeOptimized(number));

        // BigInteger method (Probabilistic Miller–Rabin)
        BigInteger bigNum = BigInteger.valueOf(number);
        System.out.println("BigInteger method: " + bigNum.isProbablePrime(20));
    }
}
