//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int d1 = Integer.parseInt(S1[0]);
            int m1 = Integer.parseInt(S1[1]);
            int y1 = Integer.parseInt(S1[2]);
            
            int d2 = Integer.parseInt(S2[0]);
            int m2 = Integer.parseInt(S2[1]);
            int y2 = Integer.parseInt(S2[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.noOfDays(d1,m1,y1,d2,m2,y2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        y1--;y2--;
        int D1=y1*365+y1/4+y1/400-y1/100;
         int D2=y2*365+y2/4+y2/400-y2/100;
         y1++;y2++;
         int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         for(int i=1;i<m1;i++)
           D1+=mon[i];
         for(int i=1;i<m2;i++)
           D2+=mon[i];
         D1+=d1;
         D2+=d2;
         if(m1>2 && ((y1%4==0 && (y1%100)!=0)||y1%400==0))
         D1++;
         if(m2>2 && ((y2%4==0 && (y2%100)!=0)||y2%400==0))
         D2++;
         return Math.abs(D2-D1);
    }
};