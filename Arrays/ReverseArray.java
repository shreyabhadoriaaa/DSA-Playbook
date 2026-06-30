public class ReverseArray {

    // ---------------- Optimal Approach ----------------
    static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverseArray(arr);

        System.out.print("Reversed Array : ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Initialize two pointers:
      left = 0
      right = n - 1

2. Swap the elements at the left and right pointers.

3. Move the left pointer one step forward.

4. Move the right pointer one step backward.

5. Continue until left >= right.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Each element is visited at most once.

Space Complexity : O(1)

Reason           : Reversal is performed in-place using only one temporary variable.

==================== INTERVIEW NOTES ====================

Pattern Used     : Two Pointers

1. Only n/2 swaps are required because each swap places
   two elements in their correct positions.

2. The algorithm modifies the original array in-place.

3. This is the most preferred interview solution because
   it uses constant extra space.

4. The same technique is used in:
   - Reverse String
   - Rotate Array
   - Palindrome Checking
   - Next Permutation
   - Reverse Linked List (conceptually)

5. The loop stops when left >= right because all required
   swaps have already been completed.

==================== EDGE CASES ====================

1. Empty array
2. Single element array
3. Array with duplicate elements
4. Array with negative numbers
5. Even-length array
6. Odd-length array

==================== FOLLOW-UP QUESTIONS ====================

1. Left Rotate Array by One.
2. Left Rotate Array by K Places.
3. Rotate Array (LeetCode 189).
4. Reverse a String.
5. Reverse a Linked List.
*/