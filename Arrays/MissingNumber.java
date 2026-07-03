public class MissingNumber{

    // ---------------- Optimal Approach ----------------
    static int missingNumber(int[] arr) {

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        System.out.println("Missing Number: " + missingNumber(arr));
    }
}

/*
======================== APPROACH ========================

1. Calculate the expected sum of numbers
   from 0 to n.

2. Calculate the actual sum of the array.

3. Subtract the actual sum
   from the expected sum.

4. The difference is the missing number.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)

Reason           : One traversal of the array.

Space Complexity : O(1)

Reason           : Only a few variables are used.

==================== INTERVIEW NOTES ====================

Pattern Used     : Mathematical Formula

1. Uses the formula:
   n × (n + 1) / 2.

2. More space-efficient than HashSet.

3. Preferred in interviews when
   O(1) extra space is required.

4. Beware of integer overflow for
   very large values (use long if needed).

==================== EDGE CASES ====================

1. Missing number is 0
2. Missing number is n
3. Single element array
4. Empty array
5. Large arrays

==================== FOLLOW-UP QUESTIONS ====================

1. Missing Number (XOR)
2. Find the Duplicate Number
3. First Missing Positive
4. Set Mismatch
5. Cyclic Sort Problems
*/