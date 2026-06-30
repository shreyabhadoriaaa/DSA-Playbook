public class LeftRotateByOne {

    // ---------------- Optimal Approach ----------------
    static void leftRotateByOne(int[] arr) {

        int firstElement = arr[0];

        // Shift all elements one position to the left
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        // Place the first element at the end
        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);

        System.out.print("Array after Left Rotation by One: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Store the first element of the array in a temporary variable.

2. Shift every element one position to the left.

3. Place the stored first element at the last index.

4. The array is now left rotated by one position.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Every element is shifted exactly once.

Space Complexity : O(1)

Reason           : Only one extra variable is used.

==================== INTERVIEW NOTES ====================

Pattern Used     : Array Manipulation

1. This is an in-place algorithm because the original
   array is modified without using an extra array.

2. Only the first element needs to be stored temporarily.

3. This is the basic building block for
   Left Rotate by K Places.

4. Unlike reversing, this problem is based on
   shifting elements.

5. If the array contains only one element,
   the array remains unchanged.

Example:

Original Array:
1 2 3 4 5

After Left Rotation by One:
2 3 4 5 1

==================== EDGE CASES ====================

1. Empty array
2. Single element array
3. Array with duplicate elements
4. Array with negative numbers

==================== FOLLOW-UP QUESTIONS ====================

1. Left Rotate Array by K Places.
2. Right Rotate Array by One.
3. Right Rotate Array by K Places.
4. Rotate Array (LeetCode 189).
5. Check if Array is Sorted and Rotated.
*/