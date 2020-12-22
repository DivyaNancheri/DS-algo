import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static int rabin_karp(String a,String b) throws IOException  {
         BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
         
         int count=0;
         long ha=0;
         long hb=0;
         int n=a.length();
         int m=b.length();
         long k=1000000007;
         int p=51;
         int x=1;
         int y=1;
         long[] pow=new long[m+1];
         pow[0]=1;
         for(int i=1;i<=m;i++){
            pow[i]=(long)(pow[i-1]*p)%k;
         }
         
         for(int i=0;i<m;i++){
             ha=(ha+((long)a.charAt(i)*pow[m-i]))%k;
             hb=(hb+((long)b.charAt(i)*pow[m-i]))%k;
         }
         if(ha==hb)
             count++;
         for(int i=m;i<n;i++){
             ha=(( (ha- (long)a.charAt(i-m) * pow[m] + a.charAt(i)) * p) % k + k )%k;
             if(ha==hb)
                count++;
         }
         // bw.write(ha);
         bw.flush();
         return count;
         
     }
     public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String[] inp=br.readLine().split(" ");
            String b=inp[0];
            String a=inp[1];
            // bw.write(b+"\n");

            bw.write(rabin_karp(a,b)+"\n");
            
        }
        bw.flush();

    }
}

// Sample Input 0

// 4
// smart yekicmsmartplrplsmartrplplmrpsmartrpsmartwmrmsmartsmart
// interviews interviewseiwcombvinterviewskrenlzp
// ds dsdsajdsrjjdsjjj
// algo yalgoalgoalgopalgoaxalgoasaxalgolalgoalgoalgo
// Sample Output 0

// 6
// 2
// 4
// 9