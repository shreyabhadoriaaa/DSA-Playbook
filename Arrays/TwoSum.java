public class TwoSum {

    // ---------------- Brute Force Approach ----------------
    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices:");

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

/*
======================== APPROACH ========================

1. Traverse the array using the first loop.

2. For every element, use a second loop
   to check all remaining elements.

3. If the sum of the current pair equals
   the target, return their indices.

4. If no valid pair is found,
   return {-1, -1}.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n²)

Reason           : Every possible pair is checked.

Space Complexity : O(1)

Reason           : No extra data structure is used.

==================== INTERVIEW NOTES ====================

Pattern Used     : Brute Force

1. This is the simplest and most intuitive solution.

2. Checks every possible pair exactly once.

3. Works for both sorted and unsorted arrays.

4. Easy to understand but inefficient
   for large input sizes.

5. Can be optimized to O(n)
   using a HashMap.

==================== EDGE CASES ====================

1. Empty array

2. Single element array

3. No valid pair exists

4. Multiple valid pairs
   (LeetCode guarantees exactly one answer.)

5. Negative numbers

6. Duplicate values

==================== FOLLOW-UP QUESTIONS ====================

1. Two Sum II - Input Array Is Sorted (LeetCode 167)

2. 3Sum (LeetCode 15)

3. 4Sum (LeetCode 18)

4. Count Pairs with Given Sum

5. Container With Most Water (LeetCode 11)
*/