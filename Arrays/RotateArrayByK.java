public class RotateArrayByK {

    // ---------------- Optimal Approach ----------------
    static void rotateArray(int[] arr, int k) {

        int n = arr.length;

        // Handle cases where k is greater than array size
        k = k % n;

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Function to reverse a part of the array
    static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(arr, k);

        System.out.print("Array after Right Rotation by " + k + " places: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Find the length of the array.

2. Reduce k using:
      k = k % n
   to handle cases where k is greater than n.

3. Reverse the entire array.

4. Reverse the first k elements.

5. Reverse the remaining (n - k) elements.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Each element is reversed at most once.

Space Complexity : O(1)

Reason           : Rotation is performed in-place without using
                   any extra array.

==================== INTERVIEW NOTES ====================

Pattern Used     : Array Reversal + Two Pointers

1. This is the most preferred interview solution.

2. The reverse() helper function is reusable for many
   array and string problems.

3. k = k % n prevents unnecessary rotations.

Example:
n = 7
k = 10

Actual rotations = 10 % 7 = 3

4. Rotation is performed completely in-place.

5. The same reversal technique is used in:
   - Reverse Array
   - Reverse String
   - Next Permutation

==================== EDGE CASES ====================

1. k = 0
2. k > n
3. Single element array
4. Empty array (should be handled before calling)
5. Array with duplicate elements

==================== FOLLOW-UP QUESTIONS ====================

1. Left Rotate Array by K Places.
2. Rotate Image (Matrix).
3. Check if Array is Sorted and Rotated.
4. Circular Array Loop.
5. Shift 2D Grid.
*/