
public class TwoSumII {

    // ---------------- Optimal Approach ----------------
    static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {

                return new int[]{left + 1, right + 1};

            } else if (sum < target) {

                left++;

            } else {

                right--;

            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Indices:");
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

/*
======================== APPROACH ========================

1. Initialize two pointers:
   - Left pointer at the beginning.
   - Right pointer at the end.

2. Calculate the sum of both elements.

3. If the sum equals the target,
   return their 1-based indices.

4. If the sum is smaller than the target,
   move the left pointer to increase the sum.

5. If the sum is greater than the target,
   move the right pointer to decrease the sum.

6. Continue until the pair is found.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Each pointer moves at most n times.

Space Complexity : O(1)

Reason           : No extra data structure is used.

==================== INTERVIEW NOTES ====================

Pattern Used     : Two Pointers

1. Works only because the array is sorted.

2. Two pointers eliminate the need for
   nested loops.

3. Moving the left pointer increases the sum.

4. Moving the right pointer decreases the sum.

5. Much faster than the brute-force O(n²)
   solution.

==================== EDGE CASES ====================

1. Empty array

2. Single element array

3. Target not present

4. Negative numbers

5. Duplicate values

==================== FOLLOW-UP QUESTIONS ====================

1. Two Sum (LeetCode 1)

2. 3Sum (LeetCode 15)

3. 4Sum (LeetCode 18)

4. Container With Most Water (LeetCode 11)

5. Count Pairs with Given Sum
*/