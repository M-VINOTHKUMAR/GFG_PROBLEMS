//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        
out.println("~");
}
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        int n=s.length();
        Stack<String> st=new Stack<>();
        int i=0;
        while(i<n)
        {
            char c=s.charAt(i);
            int j=i;
            String str=String.valueOf(c);
            boolean b=false;
            while(Character.isDigit(c) )
            {
                 c=s.charAt(i);
                 i++;
                 b=true;
            }
            if(!b)
            {
                i++;
                str=s.substring(j,i);
            }
            else{
                 i--;
                str=s.substring(j,i);
               
            }
            i--;
            st.push(str);
            i++;
            // System.out.println(st);
            if(st.peek().equals("]"))
            {
                st.pop();
                StringBuilder t=new StringBuilder();
          while(!(st.peek()).equals("["))
            {
                t.insert(0,st.pop());
            }
          st.pop();
        //  System.out.println(st.peek());
            int it=Integer.parseInt(st.pop());
            String r="";
            for(int k=0;k<it;k++)
                 r+=t;
            st.push(r);
            }
        //     i++;
        }
        s="";
       while(!st.isEmpty())
         s+=st.pop();
        return s;
    }
}