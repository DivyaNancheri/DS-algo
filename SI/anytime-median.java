import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static PriorityQueue<Integer> a = new PriorityQueue<Integer>(Collections.reverseOrder());
    static PriorityQueue<Integer> b = new PriorityQueue<Integer>();
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
                ar[j]=Integer.parseInt(inp[j]);

            a.add(ar[0]);
            bw.write(a.peek()+" ");
            for(int i=1;i<n;i++){
                if(ar[i]<a.peek())
                    a.add(ar[i]);
                else
                    b.add(ar[i]);
                int sizeCheck=a.size()-b.size();
                if(sizeCheck!=0&&sizeCheck!=1){
                    if(a.size()>b.size()){
                        int x= a.poll(); 
                        b.add(x); 
                    }
                    else{
                        int x=b.poll();
                        a.add(x);
                    }
                }
                bw.write(Integer.toString(a.peek())+" ");
            }
            bw.newLine();
            a.clear(); 
            b.clear(); 
        }
        bw.flush(); //after all test cases
    }

}