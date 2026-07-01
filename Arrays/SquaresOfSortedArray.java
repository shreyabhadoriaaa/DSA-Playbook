public class SquaresOfSortedArray {

    // ---------------- Optimal Approach ----------------
    static int[] sortedSquares(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[index] = nums[left] * nums[left];
                left++;
            } else {
                ans[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        int[] ans = sortedSquares(nums);

        System.out.print("Sorted Squares : ");

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

2. Create an answer array of the same size.

3. Start filling the answer array from the last index.

4. Compare the absolute values of the
   left and right elements.

5. The element with the larger absolute value
   will produce the larger square.

6. Store its square at the current index.

7. Move the corresponding pointer and
   decrement the index.

8. Continue until left crosses right.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : The array is traversed only once.

Space Complexity : O(n)

Reason           : An additional array is used
                   to store the result.

==================== INTERVIEW NOTES ====================

Pattern Used : Two Pointers

1. The largest square always comes from either
   the leftmost negative element or the
   rightmost positive element.

2. Compare absolute values instead of
   directly comparing the numbers.

3. Fill the answer array from the end,
   since the largest squares are found first.

4. This avoids sorting after squaring,
   improving the complexity from O(n log n)
   to O(n).

==================== EDGE CASES ====================

1. All positive numbers.
2. All negative numbers.
3. Array containing zeros.
4. Single element array.
5. Duplicate values.

==================== FOLLOW-UP QUESTIONS ====================

1. Sort Array By Parity.
2. Rearrange Array Elements by Sign.
3. Rotate Array.
4. Move Zeroes.
5. Merge Sorted Array.
*/