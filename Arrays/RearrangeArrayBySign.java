public class RearrangeArrayBySign {

    // ---------------- Optimal Approach ----------------
    static int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                ans[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        int[] ans = rearrangeArray(nums);

        System.out.print("Rearranged Array : ");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Create a new array of the same size.

2. Maintain two pointers:
      positiveIndex = 0
      negativeIndex = 1

3. Traverse the given array.

4. If the current element is positive,
   place it at the current positive index
   and move the positive index by 2.

5. If the current element is negative,
   place it at the current negative index
   and move the negative index by 2.

6. Return the rearranged array.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : The array is traversed only once.

Space Complexity : O(n)

Reason           : An additional array is used to store
                   the rearranged elements.

==================== INTERVIEW NOTES ====================

Pattern Used     : Array Traversal

1. This solution assumes that the number of
   positive and negative elements is equal,
   which is guaranteed in this problem.

2. Positive numbers occupy even indices,
   while negative numbers occupy odd indices.

3. The relative order of positive and negative
   elements is preserved.

4. This solution is simple and easy to understand,
   making it the preferred interview approach.

==================== EDGE CASES ====================

1. Array of size 2.
2. Alternate positive and negative numbers.
3. Equal number of positive and negative elements.
4. Positive and negative values of different magnitudes.

==================== FOLLOW-UP QUESTIONS ====================

1. Sort Array By Parity.
2. Move Zeroes.
3. Sort Colors.
4. Partition Array According to Pivot.
5. Wiggle Sort.
*/