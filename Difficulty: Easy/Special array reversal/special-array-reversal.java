//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        //complete the function here
        char c[]=str.toCharArray();
        int n=c.length;
        int i=0,j=n-1;
        while(i<j)
        {
            char ch1=c[i];
            char ch2=c[j];
            boolean b=true;
            if(!Character.isLetter(ch1))
            {
              i++;
               b=false;
            }
            if(!Character.isLetter(ch2))
            {
              j--;
              b=false;
            }
            if(b)
            {
                char ch3=c[i];
                c[i]=c[j];
                c[j]=ch3;
                i++;
                j--;
            }
            
        }
        return String.valueOf(c);
    }
}