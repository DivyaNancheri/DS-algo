import java.io.*;
import java.util.*;

public class Solution {
    static boolean check(int []ca,int []cb){
        for(int k=0;k<26;k++){
            if(!(ca[k]>=cb[k]))
                return false;
        }
        return true;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String[] inp=br.readLine().split(" ");
            String b=inp[0];
            String a=inp[1];
            int[] cb = new int[26];
            int[] ca = new int[26];
            for(int i=0;i<b.length();i++){
                cb[b.charAt(i)-'a']++;
                ca[i]=0;
            }
            
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<a.length();i++){
                for(int k=0;k<26;k++){
                    ca[k]=0;
                }
                for(int j=i;j<a.length();j++){
                    ca[a.charAt(j)-'a']++;
                    if(check(ca,cb)==true){
                        ans= Math.min(ans,j-i+1);
                    }
                }
            }
            if(ans==Integer.MAX_VALUE){
                bw.write(-1+"\n");
            }
            else{
                bw.write(ans+"\n");
            }
        }
        bw.flush(); //after all test cases
    }
    
}