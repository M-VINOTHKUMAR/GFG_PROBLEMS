//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n=sc.nextInt();
                    int d=sc.nextInt();
                    Solution obj = new Solution();
                    
                    Vector<Integer> v= obj.solve(n,d);
                    
                    for (int i = 0; i < v.size(); i++) 
                        System.out.print(v.get(i) + " ");
                        
                    System.out.println();
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public Vector<Integer> solve(int n, int d)
    {
         Vector<Integer> result = new Vector<>();
        String digit = String.valueOf(d);  // Convert the digit to a string
        
        for (int i = 0; i <= n; i++) {
            if (String.valueOf(i).contains(digit)) {
                result.add(i);  // Add the number if it contains the digit
            }
        }
        if(result.size()==0)
           result.add(-1);
        return result;
    }
}