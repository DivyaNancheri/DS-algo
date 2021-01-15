import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            
            String[] inp=br.readLine().split(" ");
            String str1=inp[0];
            String str2=inp[1];

            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            int n=str2.length();
            int flag=0;
            int ca[]=new int[26];
            int cb[]=new int[26];
            for(int i=0;i<str1.length();i++)
                ca[str1.charAt(i)-97]++;

            for(int i=0;i<str2.length();i++)
                cb[str2.charAt(i)-97]++;
            
            for(int i=1;i<(1<<n);i++){
                Arrays.fill(cb, 0); 
                for(int j=0;j<n;j++){
                    if(((i>>j)&1) == 1){
                        cb[str2.charAt(j)-97]++;
                        bw.write(str2.charAt(j)+"");
                    }
                }
                int k=0;
                for( k=0;k<26;k++){
                    if(cb[k]>=ca[k])
                        continue;
                }
                if(k==26){
                    flag=1;
                    break;
                }
                bw.newLine();
            }
            if(flag==1){
                System.out.println("Yes"); 
            }
            else{
                System.out.println("No"); 
            }

                
            
        }
        bw.flush(); //after all test cases
    }
}