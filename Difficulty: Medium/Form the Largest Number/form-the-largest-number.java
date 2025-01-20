//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            Solution ob = new Solution();
            String ans = ob.findLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String findLargest(int[] arr) {
        // code here
         int n = arr.length;
        String[] str = new String[n];
        
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);  // Sort in descending order
            }
        });
        
        if (str[0].equals("0")) {
            return "0";  // Handle edge case where all numbers are zero
        }
        
        StringBuilder result = new StringBuilder();
        for (String val : str) {
            result.append(val);
        }
        
        return result.toString();
    }
}