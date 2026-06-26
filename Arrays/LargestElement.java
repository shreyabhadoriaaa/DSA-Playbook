import java.util.Arrays;

public class LargestElement {

    // Brute Force Approach
    static int bruteForce(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    // Optimal Approach
    static int optimal(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        // clone() is used because Arrays.sort() modifies the original array.
        System.out.println("Brute Force : " + bruteForce(arr.clone()));

        System.out.println("Optimal : " + optimal(arr));
    }
}

/*
======================== APPROACH ========================

Brute Force:
1. Sort the array in ascending order.
2. The last element of the sorted array is the largest.
3. Return the last element.

Optimal:
1. Assume the first element is the largest.
2. Traverse the array from index 1.
3. Compare each element with the current maximum.
4. If the current element is greater, update the maximum.
5. Return the maximum element.

================== COMPLEXITY ANALYSIS ==================

Brute Force:
Time Complexity  : O(n log n)
Reason           : Sorting the array takes O(n log n).

Space Complexity : O(1)

Optimal:
Time Complexity  : O(n)
Reason           : The array is traversed only once.

Space Complexity : O(1)
Reason           : Only one extra variable (max) is used.

==================== INTERVIEW NOTES ====================

1. Sorting is not required when only the largest element is needed.
   A single traversal gives the answer in linear time.

2. Initialize:
      int max = arr[0];
   instead of:
      int max = 0;
   because the array may contain negative numbers.

3. Start the loop from index 1 because the first element
   is already stored in max.

4. Arrays.sort() modifies the original array.
   Therefore arr.clone() is used while calling the brute-force method.

5. Works correctly for:
   - Negative numbers
   - Duplicate elements
   - Single-element arrays

==================== FOLLOW-UP QUESTIONS ====================

1. Find the Second Largest Element.
2. Find the Largest Element using Recursion.
3. Find the Kth Largest Element.
4. Find the Largest Element in every Sliding Window.
5. Find the Largest and Second Largest in a Single Traversal.
*/