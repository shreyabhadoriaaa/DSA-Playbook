public class CheckSortedArray {

    // ---------------- Optimal Approach ----------------
    static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        if (isSorted(arr)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}

/*
======================== APPROACH ========================

Optimal:
1. Traverse the array from index 1.
2. Compare the current element with the previous element.
3. If the current element is smaller than the previous one,
   the array is not sorted.
4. Return false immediately.
5. If the loop completes without finding any violation,
   return true.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Reason           : In the worst case, every element is checked once.

Space Complexity : O(1)
Reason           : No extra space is used.

==================== INTERVIEW NOTES ====================

1. This checks whether the array is sorted in
   Non-Decreasing Order (Ascending).

   Example:
   {1, 2, 2, 4, 5} → Sorted

2. If the condition is changed to:

      arr[i] <= arr[i - 1]

   then the array must be in
   Strictly Increasing Order.

   Example:
   {1, 2, 2, 4} → Not Sorted

3. Return immediately when an unsorted pair is found.
   This is called Early Termination and improves
   the best-case performance.

4. Arrays with one element or no elements
   are always considered sorted.

==================== EDGE CASES ====================

1. Single element array
2. Empty array
3. All elements are equal
4. Negative numbers
5. Already sorted array
6. Reverse sorted array

==================== FOLLOW-UP QUESTIONS ====================

1. Check if an array is sorted in Descending Order.
2. Find the first index where sorting is violated.
3. Check if an array can become sorted by swapping one pair.
4. Check if an array can become sorted by reversing one subarray.
5. Remove duplicates from a sorted array.
*/