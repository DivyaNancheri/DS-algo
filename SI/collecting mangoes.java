import java.io.*;
import java.util.*;

public class Solution {
    static Stack<Integer> stack = new Stack<Integer>(); 
    static Stack<Integer> maxStack = new Stack<Integer>(); 
    
    static void push(int x){
        stack.push(x);
        if (stack.size() == 1)  
        {  
            maxStack.push(x);  
        }
        else if (x >= maxStack.peek())  
            maxStack.push(x);   

    }
    
    
    static void pop(){

        if(stack.size() >0){
            if(maxStack.peek().equals(stack.peek()))
                maxStack.pop();
            stack.pop(); 
        }
    }
    
    

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n=Integer.parseInt(br.readLine());
            bw.write("Case "+(t+1)+":\n");
            while(n-- > 0){
                
                String op1=br.readLine();
                if(op1.equals("R")){
                    pop();
                }
                else if(op1.equals("Q")){
                    if(maxStack.size() ==0){
                        bw.write("Empty\n");
                    }
                    else{
                        bw.write((maxStack.peek()).toString()+"\n");
                    }
                }
                else{
                    String[] inp = op1.split(" "); 
                    String n1=inp[0];
                    
                    int x=Integer.parseInt(inp[1]);
                    push(x);
                     
                }    
            }
            stack.clear(); 
            maxStack.clear(); 
        }
        bw.flush(); //after all test cases
    }

}


// Sample Input 0

// 2
// 7
// A 10
// A 5
// Q
// A 100
// Q
// R
// Q
// 6
// A 5
// Q
// R
// Q
// R
// R
// Sample Output 0

// Case 1:
// 10
// 100
// 10
// Case 2:
// 5
// Empty