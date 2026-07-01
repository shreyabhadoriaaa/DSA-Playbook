public class SortArrayByParity {

    // ---------------- Optimal Approach ----------------
    static int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // Left element is already even
            if (nums[left] % 2 == 0) {
                left++;
            }

            // Right element is already odd
            else if (nums[right] % 2 != 0) {
                right--;
            }

            // Left is odd and Right is even
            else {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};

        int[] ans = sortArrayByParity(nums);

        System.out.print("Sorted Array By Parity : ");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Initialize two pointers:
      left = 0
      right = n - 1

2. Traverse the array while left < right.

3. If the left element is even,
   it is already in the correct position.
   Move the left pointer forward.

4. If the right element is odd,
   it is already in the correct position.
   Move the right pointer backward.

5. If the left element is odd and
   the right element is even,
   swap both elements.

6. Continue until both pointers meet.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Each element is visited at most once.

Space Complexity : O(1)

Reason           : Rearrangement is performed in-place.

==================== INTERVIEW NOTES ====================

Pattern Used : Two Pointers + Swap

1. Relative order of even and odd numbers
   does NOT need to be maintained.

2. Since order does not matter, an in-place
   solution is the most efficient.

3. Swapping is performed only when:
      - Left points to an odd number.
      - Right points to an even number.

4. This technique is similar to the partition
   step used in Quick Sort.

==================== EDGE CASES ====================

1. All elements are even.
2. All elements are odd.
3. Single element array.
4. Empty array.
5. Duplicate values.

==================== FOLLOW-UP QUESTIONS ====================

1. Rearrange Array Elements by Sign.
2. Sort Colors.
3. Move Zeroes.
4. Partition Array According to Pivot.
5. Wiggle Sort.
*/