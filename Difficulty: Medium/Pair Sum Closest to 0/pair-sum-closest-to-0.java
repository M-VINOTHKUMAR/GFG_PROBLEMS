//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)throws IOException
    {
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int[] arr = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; ++i)
                arr[i] = Integer.parseInt(s[i]);

    		out.println (new Solution().closestToZero (arr, n));
        
out.println("~");
}
        out.close();
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int closestToZero (int arr[], int n)
    {
       
    if (n < 2) {
            return -1;  // We need at least two elements for a pair
        }
        
        Arrays.sort(arr);  // Sort the array
        int left = 0, right = n - 1;
        int closestSum = arr[left] + arr[right];  // Initialize with the sum of the two farthest elements

        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (Math.abs(sum) < Math.abs(closestSum) || 
               (Math.abs(sum) == Math.abs(closestSum) && sum > closestSum)) {
                closestSum = sum;
            }
            
            if (sum < 0) {
                left++;  // Move left pointer to increase sum
            } else {
                right--;  // Move right pointer to decrease sum
            }
        }
        
        return closestSum;
}
}