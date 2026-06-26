import java.util.Arrays;

public class SecondLargestElement {

    // ---------------- Brute Force ----------------
    static int bruteForce(int[] arr) {

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] != largest) {
                return arr[i];
            }

        }

        return -1; // Second largest doesn't exist
    }

    // ---------------- Better ----------------
    static int better(int[] arr) {

        int largest = arr[0];

        // Find Largest
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        int secondLargest = Integer.MIN_VALUE;

        // Find Second Largest
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    // ---------------- Optimal ----------------
    static int optimal(int[] arr) {

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];

            }

        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 89};

        System.out.println("Brute Force : " + bruteForce(arr.clone()));
        System.out.println("Better      : " + better(arr));
        System.out.println("Optimal     : " + optimal(arr));
    }
}

/*
======================== APPROACH ========================

Brute Force:
1. Sort the array.
2. Store the largest element.
3. Traverse from the end until a different element is found.
4. That element is the second largest.

Better:
1. Traverse once to find the largest element.
2. Traverse again to find the greatest element that is not equal to the largest.
3. Return the second largest.

Optimal:
1. Maintain two variables:
      largest
      secondLargest
2. Traverse the array only once.
3. If the current element is greater than largest:
      - Update secondLargest = largest
      - Update largest = current element
4. Otherwise, if the current element is greater than secondLargest
   and not equal to largest:
      - Update secondLargest.
5. Return secondLargest.

================== COMPLEXITY ANALYSIS ==================

Brute Force:
Time Complexity  : O(n log n)
Reason           : Sorting dominates the complexity.

Space Complexity : O(1)

Better:
Time Complexity  : O(2n) ≈ O(n)
Reason           : Two separate traversals.

Space Complexity : O(1)

Optimal:
Time Complexity  : O(n)
Reason           : Only one traversal is required.

Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. The second largest element must be DIFFERENT from the largest.
   Example:
      {10, 10, 10}
   Output: -1

2. Integer.MIN_VALUE is used so that negative numbers
   are handled correctly.

3. The optimal approach is preferred in interviews because
   it finds both largest and second largest in a single pass.

4. Sorting changes the original array.
   Use arr.clone() if the original array needs to be preserved.

5. Always handle edge cases:
   - Array size < 2
   - All elements are the same
   - Negative numbers
   - Duplicate largest elements

==================== FOLLOW-UP QUESTIONS ====================

1. Find the Second Smallest Element.
2. Find Largest and Second Largest in one traversal.
3. Find the Kth Largest Element.
4. Find the Third Largest Element.
5. Find the Largest & Second Largest using Recursion.
*/