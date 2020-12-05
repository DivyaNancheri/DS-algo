import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int tc=Integer.parseInt(br.readLine());
        for(int t=0;t<tc;t++) {
            int n, k;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            k=Integer.parseInt(inp[1]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
                ar[j]=Integer.parseInt(inp[j]);

            Arrays.sort(ar);
            int sum=0,c=0;
            for(int i=0,j=n-1;i!=j;){
                sum=ar[i]+ar[j];
                if(sum==k){
                    c=1;
                    break;
                }
                else if(sum<k)
                    i++;
                    else
                    j--;
            }
            if(c==1)
                bw.write("True\n");
            else
                bw.write("False\n");
            
        }
        bw.flush(); 
    }
}