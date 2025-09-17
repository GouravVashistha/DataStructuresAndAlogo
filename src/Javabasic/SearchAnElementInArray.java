package Javabasic;

import java.util.HashSet;
import java.util.Set;

public class SearchAnElementInArray {

    /**
     * Linear Search (Brute Force)
     * Time Complexity: O(n)
     * Checks each element one by one until target is found.
     */
    static int searchTarget(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return 1; // found
            }
        }
        return -1; // not found
    }

    /**
     * Binary Search (Works only on sorted arrays)
     * Time Complexity: O(log n)
     * Divides the array into halves to search efficiently.
     */
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid; // return index if found
            } else if (arr[mid] < target) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }
        return -1; // not found
    }

    /**
     * Search using HashSet
     * Time Complexity: O(n) (on average O(1) lookup)
     * Stores all array elements in a HashSet and checks for target.
     */
    static boolean searchUsingHashSet(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // insert into HashSet
        }
        return set.contains(target); // O(1) lookup
    }

    /**
     * Recursive Search (Checks from end to start)
     * Time Complexity: O(n)
     * Calls itself by reducing array size each time.
     */
    static boolean recursiveSearch(int[] arr, int target, int n) {
        if (n == 0) {
            return false; // base case: no element left
        }
        if (arr[n - 1] == target) {
            return true; // found at position n-1
        }
        return recursiveSearch(arr, target, n - 1); // recursive call
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 46, 50, 90};
        int target = 46;

        // Linear Search
        System.out.println("Linear Search: " + searchTarget(arr, target));

        // Binary Search (returns index)
        System.out.println("Binary Search (Index): " + binarySearch(arr, target));

        // HashSet-based Search
        System.out.println("Search using HashSet: " + searchUsingHashSet(arr, target));

        // Recursive Search
        System.out.println("Recursive Search: " + recursiveSearch(arr, target, arr.length));
    }
}
