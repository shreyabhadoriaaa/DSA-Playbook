import java.util.ArrayList;

public class removeElement {

    // Brute Force Approach
    static int bruteForce(int[] nums, int val) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

    // Optimal Approach
    static int optimal(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != val) {
                nums[i++] = nums[j];
            }

        }

        return i;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] bruteArray = nums.clone();
        int[] optimalArray = nums.clone();

        System.out.println("Brute Force : " + bruteForce(bruteArray, val));

        System.out.println("Optimal : " + optimal(optimalArray, val));
    }
}

/*
======================== APPROACH ========================

Brute Force:
1. Create an ArrayList to store elements that are not equal to val.
2. Traverse the array.
3. Add only valid elements to the list.
4. Copy the list back into the original array.
5. Return the size of the list.

Optimal:
1. Use two pointers:
      i -> Position where the next valid element should be placed.
      j -> Traverses the entire array.
2. Traverse the array using j.
3. If nums[j] is not equal to val,
      copy nums[j] to nums[i]
      increment i.
4. Ignore elements equal to val.
5. Return i, which represents the number of valid elements.

================== COMPLEXITY ANALYSIS ==================

Brute Force:
Time Complexity  : O(n)
Reason           : One traversal to store elements and another to copy them.

Space Complexity : O(n)
Reason           : Extra ArrayList is used.

Optimal:
Time Complexity  : O(n)
Reason           : Only one traversal of the array.

Space Complexity : O(1)
Reason           : No extra data structure is used.

==================== INTERVIEW NOTES ====================

1. The array size does NOT decrease.
   Java arrays have a fixed size.

2. Only the first k elements are important.
   Elements after index (k - 1) can contain any value.

3. i always points to the next position where a valid element
   should be placed.

4. j scans every element exactly once.

5. nums[i++] = nums[j] means:
      - Place the current valid element at index i.
      - Increment i afterwards.

6. Do NOT use ++i here.
   It skips index 0 and produces incorrect results.

7. This is a classic Two Pointer (Fast & Slow Pointer) problem.

==================== FOLLOW-UP QUESTIONS ====================

1. Remove Duplicates from Sorted Array.
2. Move Zeroes.
3. Sort Array By Parity.
4. Remove Duplicates II.
5. Remove All Occurrences of an Element from a Linked List.
*/