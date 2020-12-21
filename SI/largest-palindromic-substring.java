import java.io.*;
import java.util.*;

public class Solution {
    public static int longestPalinSubstring(String str, int p1, int p2) 
    {
        while(p1>=0 && p2<str.length() && str.charAt(p1)==str.charAt(p2)){
            // System.out.println("p1="+p1+"   str.charAt(p1)="+str.charAt(p1));
            // System.out.println("p2="+p2+"   str.charAt(p2)="+str.charAt(p2));

            p1--;
            p2++;
        }
        // p1--;
        // p2++;
        // System.out.println("p2="+p2+"  p1="+p1+"   p2-p1+1="+(p2-p1+1));
        return p2-p1-1;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int ans=0;
            int n=Integer.parseInt(br.readLine());
            String str=br.readLine();
            for (int i=0;i<str.length();i++){
                // bw.write("In main i call::::str.charAt(i)="+str.charAt(i)+"\n");
                int odd=longestPalinSubstring(str,i,i);
                int even=longestPalinSubstring(str,i,i+1);
                ans=Math.max(ans, even);
                ans=Math.max(ans, odd);
            }
                      
            bw.write(ans+"\n");
           
        }
        bw.flush(); 
    }
                      
}
