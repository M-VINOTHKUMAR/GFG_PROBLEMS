//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countWays(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int countWays(String s) {
        // code here
       if(s.length()==0 || s.charAt(0)=='0')
         return 0;
         int n=s.length();
        int dp[]=new int[n+1];
         dp[0]=1;
         dp[1]=1;
        for(int i=2;i<=n;i++){
            if(s.charAt(i-1)!='0')
              dp[i]+=dp[i-1];
              int val=Integer.parseInt(s.substring(i-2,i));
             if(val>9 && val<27)
             {
                 dp[i]+=dp[i-2];
             }
        }
        return dp[n];
    }
}