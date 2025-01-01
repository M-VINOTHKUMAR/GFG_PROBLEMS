//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> dictionary = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            dictionary.add(p);
                        }
                    String s = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(n, s, dictionary));  
                    
                
System.out.println("~");
}
        }
}
// } Driver Code Ends

//User function Template for Java

class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> d )
    {
        //code here
        int m=s.length();
        int arr[]=new int[m+1];
        arr[0]=1;
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]==1 && d.contains(s.substring(j,i)))
                {
                   arr[i]=1;
                   break;
                }
            }
        }
        return arr[m];
    }
}