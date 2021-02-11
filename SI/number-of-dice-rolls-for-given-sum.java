import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        long m=1000000007;
        int p=100000;
        long[] dp =new long[(int)p+1];
        dp[0]=1;

        for(int i=1;i<p+1;i++){
            for(int j=1;j<=6;j++){
                if(i-j>=0){
                    dp[i]=(dp[i]+dp[i-j])%m;
                }
            }
        }
        // for(int i=1;i<501;i++){
        //     bw.write("i="+i+"  dp[i]="+dp[i]);
        //     bw.newLine();
        // }
        
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            
            bw.write((dp[n])%m+"\n");
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

// 4
// 976
// 63
// 16
// 765996555