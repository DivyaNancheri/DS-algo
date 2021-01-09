import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n, k, d;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            k=Integer.parseInt(inp[1]);
            d=Integer.parseInt(inp[2]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            int tot_prob=0;
            int ans=0;
            for(int j=0;j<n;j++){
                ar[j]=Integer.parseInt(inp[j]);
                tot_prob+=ar[j];
            }
            int days=(int)tot_prob/k;
            if(days>d)
                bw.write(d+"\n");
            else
                bw.write(days+"\n");
        }
        bw.flush(); //after all test cases
    }

}