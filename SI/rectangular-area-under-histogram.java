import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int area(int[] ar, int n){
        Stack<Integer> stack = new Stack<>();
        int max = 0,x,area;  
       
        int i = 0; 
        while (i < n) 
        { 
            if (stack.empty() || ar[stack.peek()] <= ar[i]) 
                stack.push(i++); 
       
            else
            { 
                x = stack.peek();
                stack.pop();
                if(stack.empty()){
                    area=ar[x]*i;
                }
                else{
                    area=ar[x]*(i-stack.peek()-1);
                }
                max=Math.max(max,area);
            } 
        } 
       
        
        while (stack.empty() == false) 
        { 
            x = stack.peek();
            stack.pop();
            if(stack.empty()){
                area=ar[x]*i;
            }
            else{
                area=ar[x]*(i-stack.peek()-1);
            }
            max=Math.max(max,area);
        } 
        
        return max;
    }

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

            int ans=area(ar,n);

            bw.write(Integer.toString(ans)+"\n");
        }
        bw.flush(); //after all test cases
    }

}

// Sample Input 0

// 2
// 7
// 6 2 5 4 5 1 6 
// 4
// 5 10 12 4 
// Sample Output 0

// 12
// 20