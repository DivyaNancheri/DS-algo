import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        long m=1000000007;
        int p=100000;
        long[] dp0 =new long[(int)p+1];
        long[] dp1 =new long[(int)p+1];
        dp0[0]=1;
        dp1[0]=1;

        for(int i=1;i<p;i++){
            dp0[i]=(dp0[i-1]+dp1[i-1])%m;
            dp1[i]=dp0[i-1];
        }
        
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            
            bw.write((dp0[n-1]+dp1[n-1])%m+"\n");
        }
        bw.flush(); //after all test cases
    }
}

// Sample Input 0

// 5
// 3
// 11
// 7
// 5
// 500
// Sample Output 0

// 5
// 233
// 34
// 13
// 73724597