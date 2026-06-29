import java.util.Arrays;

public class RemoveDuplicates {

    // ---------------- Optimal Approach ----------------
    static int removeDuplicates(int[] nums) {

        int nonDuplicate = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[nonDuplicate - 1] != nums[i]) {

                nums[nonDuplicate] = nums[i];
                nonDuplicate++;

            }

        }

        return nonDuplicate;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = removeDuplicates(nums);

        System.out.println("Number of Unique Elements : " + k);

        System.out.print("Array after removing duplicates : ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

/*
======================== APPROACH ========================

Optimal:
1. Assume the first element is always unique.
2. Maintain a pointer (nonDuplicate) to store the next unique element.
3. Traverse the array from index 1.
4. If the current element is different from the previous unique element:
      - Place it at index nonDuplicate.
      - Increment nonDuplicate.
5. Return nonDuplicate as the count of unique elements.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Reason           : The array is traversed only once.

Space Complexity : O(1)
Reason           : No extra array is used.

==================== INTERVIEW NOTES ====================

1. This problem works only because the array is already sorted.

2. The algorithm uses the Two Pointer technique.

3. nonDuplicate always points to the position where
   the next unique element should be placed.

4. The array is modified in-place.
   No additional array is created.

5. Only the first k elements are valid after the operation.

Example:

Original Array:
1 1 2 2 3 4 4 5

Modified Array:
1 2 3 4 5 _ _ _

k = 5

==================== EDGE CASES ====================

1. Empty array
2. Array with one element
3. All elements are the same
4. No duplicates
5. All elements are unique

==================== FOLLOW-UP QUESTIONS ====================

1. Remove Duplicates from Sorted Array II.
2. Remove Element.
3. Move Zeroes.
4. Merge Sorted Array.
5. Remove Duplicates from Linked List.
*/