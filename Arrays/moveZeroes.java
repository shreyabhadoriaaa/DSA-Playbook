public class moveZeroes {

    // ---------------- Optimal Approach ----------------
    static void moveZeroes(int[] nums) {

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {

                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("Output : ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

Optimal (Two Pointers):

1. Initialize two pointers:
      left  -> Points to the position where the next non-zero
               element should be placed.
      right -> Traverses the entire array.

2. Traverse the array using the right pointer.

3. Whenever a non-zero element is found:
      - Swap nums[left] and nums[right].
      - Increment left.

4. After the traversal, all non-zero elements are shifted
   to the front while all zeroes automatically move to the end.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : The array is traversed only once.

Space Complexity : O(1)

Reason           : Swapping is done in-place without using
                   any extra array.

==================== INTERVIEW NOTES ====================

1. Uses the Two Pointer technique.

2. Preserves the relative order of all non-zero elements.

3. Performs the operation completely in-place.

4. No extra array is required.

5. Even if left == right, swapping is safe.
   Java simply swaps the element with itself.

Example:
left = 2
right = 2

temp = nums[2];
nums[2] = nums[2];
nums[2] = temp;

No change occurs.

6. This solution is preferred over sorting because sorting
   changes the relative order of non-zero elements.

==================== EDGE CASES ====================

1. Array contains only zeroes.
2. Array contains no zeroes.
3. Single element array.
4. Empty array.
5. Zeroes at the beginning.
6. Zeroes at the end.
7. Consecutive zeroes.

==================== FOLLOW-UP QUESTIONS ====================

1. Remove Duplicates from Sorted Array.
2. Remove Element.
3. Sort Colors (Dutch National Flag).
4. Sort Array by Parity.
5. Rearrange Positive and Negative Numbers.
*/