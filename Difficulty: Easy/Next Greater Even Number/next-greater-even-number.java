//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String str = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.getNextEven(str));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public boolean nextPermutation(char[] arr) {
        // Find the rightmost character which is smaller than its next character
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find the rightmost character which is greater than arr[i]
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap the characters at indices i and j
            swap(arr, i, j);
        } else {
            return false; // No further permutations possible
        }

        // Reverse the sequence from arr[i + 1] to the end of the array
        reverse(arr, i + 1, arr.length - 1);
        return true;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public long getNextEven(String x) {
        long input = Long.parseLong(x);
        // Convert the string to long for handling large numbers

        char[] arr = x.toCharArray();
        // Convert the string to an array of characters
        int c = 0;
        int l = arr.length;

        // Count the number of odd digits
        for (int i = 0; i < l; i++) {
            int digit = arr[i] - '0';
            if (digit % 2 != 0) {
                c++;
            }
        }

        // If there is at least one even digit
        if (c != l) {
            Arrays.sort(arr); // Sort array to ensure we get permutations in
                              // lexicographical order
            boolean found = false;

            do {
                String snew = new String(arr);
                long m = Long.parseLong(snew);

                // Find the next even permutation greater than or equal to the input
                if (m > input && m % 2 == 0) {
                    return m;
                }
                found = true;
            } while (nextPermutation(arr) && found);

            // If no valid permutation is found, return -1
            return -1;
        } else {
            return -1;
        }
    }
}
