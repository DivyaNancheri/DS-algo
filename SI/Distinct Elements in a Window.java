import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
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

            //logic goes here
            HashMap<Integer, Integer> m = new HashMap<Integer, Integer>(); 
            for (int i=0;i<k;i++)  
            {   
                if (m.containsKey(ar[i])) {  
                    m.put(ar[i], m.get(ar[i])+1); 
                }
                else
                    m.put(ar[i], 1); 
            }
            // bw.write("after k insertions,m= "+m+"\n");
            bw.write(m.size()+" "); 
            for (int i=1;i+k<=n;i++)  
            {   //removing outgoing
                if(m.get(ar[i-1])==1){
                   m.remove(ar[i-1]);  
                }
                else if(m.get(ar[i-1])>1){
                   m.put(ar[i-1], m.get(ar[i-1])-1);  
                }
                // bw.write("after deletion,m= "+m+"\n");
                // bw.write("ar[i+k]= "+ar[i+k-1]+"\n");
                 //inserting incoming
                if (m.containsKey(ar[i+k-1])) {  
                    m.put(ar[i+k-1], m.get(ar[i+k-1])+1); 
                }
                else
                    m.put(ar[i+k-1], 1); 
                // bw.write("after insertion,m= "+m+"\n");
                 bw.write(m.size()+" "); 
            }
            bw.write("\n");
        }
        bw.flush(); //after all test cases
    }

}