import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    // ---------------- Optimal Approach ----------------
    static HashMap<Integer, Integer> frequencyCount(int[] arr) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> result = frequencyCount(arr);

        System.out.println("Frequency Count:");

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

/*
======================== APPROACH ========================

1. Create a HashMap to store each element and its frequency.

2. Traverse the array once.

3. If the element already exists in the HashMap,
   increment its frequency.

4. Otherwise, insert it with frequency 1.

5. Return the completed HashMap.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : Every element is processed exactly once.

Space Complexity : O(n)

Reason           : In the worst case, every element is unique.

==================== INTERVIEW NOTES ====================

Pattern Used     : Hashing (HashMap)

1. HashMap provides average O(1) insertion and lookup.

2. getOrDefault() avoids checking whether
   a key already exists.

3. Frequency counting is a common interview pattern.

4. Frequently used in problems involving
   duplicates, majority elements, and anagrams.

==================== EDGE CASES ====================

1. Empty array
2. Single element array
3. All elements are identical
4. All elements are unique
5. Negative numbers

==================== FOLLOW-UP QUESTIONS ====================

1. Majority Element (LeetCode 169)
2. Top K Frequent Elements
3. Sort Characters By Frequency
4. Valid Anagram
5. First Unique Character
*/