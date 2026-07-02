import java.util.HashSet;

public class ContainsDuplicate {

    // ---------------- Optimal Approach ----------------
    static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {

            // add() returns false if the element already exists
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean ans = containsDuplicate(nums);

        System.out.println("Contains Duplicate : " + ans);
    }
}

/*
======================== APPROACH ========================

1. Create a HashSet to store unique elements.

2. Traverse each element of the array.

3. Try adding the current element to the HashSet.

4. If add() returns false, the element already
   exists in the HashSet.

5. Return true immediately since a duplicate
   has been found.

6. If the loop completes, no duplicates exist.

7. Return false.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Each element is visited once and
                   HashSet operations take O(1)
                   on average.

Space Complexity : O(n)

Reason           : In the worst case, all elements
                   are unique and stored in the
                   HashSet.

==================== INTERVIEW NOTES ====================

Pattern Used : Hashing (HashSet)

1. HashSet stores only unique elements.

2. add(element) returns:
      • true  -> Element inserted successfully.
      • false -> Element already exists.

3. As soon as a duplicate is found, return true.
   No need to traverse the remaining elements.

4. This solution avoids the O(n log n) sorting
   approach and achieves O(n) time complexity.

==================== EDGE CASES ====================

1. Empty array.
2. Single element array.
3. All unique elements.
4. All duplicate elements.
5. Negative numbers.
6. Large input size.

==================== FOLLOW-UP QUESTIONS ====================

1. Two Sum.
2. Valid Anagram.
3. Intersection of Two Arrays.
4. Top K Frequent Elements.
5. Longest Consecutive Sequence.
*/