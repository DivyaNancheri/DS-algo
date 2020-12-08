import java.io.*;
import java.util.*;

public class Solution {
    
    boolean tripletSum(int a[], int n, int x) 
    { 
        int sum=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1,k=n-1;j<k;){
                sum=a[i]+a[j]+a[k];
                if(sum==x)
                    return true;
                else if(sum<x)
                    j++;
                else
                    k--;
            }
        }
        // If we reach here, then no triplet was found 
        return false; 
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Solution sol=new Solution();
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n, k;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            k=Integer.parseInt(inp[1]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
                ar[j]=Integer.parseInt(inp[j]);
            Arrays.sort(ar);
            if(sol.tripletSum(ar,n,k))
                bw.write("true\n");
            else
                bw.write("false\n");
        }
        bw.flush(); //after all test cases
    }
}