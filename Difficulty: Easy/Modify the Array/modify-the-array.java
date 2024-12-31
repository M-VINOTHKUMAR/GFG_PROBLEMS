//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().modifyAndRearrangeArr(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n=arr.length;
        int i=0;
        int k=0;
        while(i<n)
        {
            int j=i;
            i++;
            while(i<n && arr[j]==arr[i] && arr[j]!=0)
            {
                if(j==i+1)
                k=i;
                arr[j]+=arr[i];
                arr[i]=0;
                i++;
            }
            i--;
            i++;
        }
        i=0;
        while(i<n && k<n)
        {
            if(arr[i]!=0)
            {
                i++;
                k=i;
                continue;
            }
            else if(arr[k]!=0)
            {
                int t=arr[i];
                arr[i]=arr[k];
                arr[k]=t;
            }
            k++;
        }
        

        ArrayList<Integer> l=new ArrayList<>();
        for(int m:arr)
          l.add(m);
        return l;
    }
}
