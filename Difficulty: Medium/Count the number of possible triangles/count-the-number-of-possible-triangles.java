//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        int pos=0;
        Arrays.sort(arr);
        for(int k=2;k<n;k++)
        {
            int i=0,j=k-1;
            while(i<j)
            {
                if(arr[i]+arr[j]>arr[k])
                {
                    pos+=j-i;
                    j--;
                }else{
                    i++;
                }
            }
        }
        return pos;
    }
}