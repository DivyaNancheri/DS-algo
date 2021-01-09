import java.io.*;
import java.util.*;

public class Solution {

    static int f=-1,r=-1;
    static int max=10000;
    static int[] dq= new int[max];
    
    static void push_back(int x){
        // if(r!=max-1){
            if(f==-1){
                f=0;
            }
            else
                r++;
            dq[r]=x;
        // dq[++r]=x;
        // }
    }
        
    static void push_front(int x){
        // if(f!=0){
            if(r==-1){
                f=0;
                r=0;   
            }
        else if(f==0)
            front = size - 1 ; 
            else
                f--;
            dq[f]=x;
        // }
    }    
    
    static void pop_front(){
        if(f==-1){
            System.out.println("Empty");
        }
        else{
            System.out.println("pop_front="+dq[f]);
            if(f==r){
                f=-1;
                r=-1;
            }
            else
                f++;
        }
    }
        
    static void pop_back(){
        if(r==-1){
            System.out.println("Empty");
        }
        else{
            System.out.println("pop_back="+dq[r]);
            if(f==r){
                f=-1;
                r=-1;
            }
            else
                r--;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String op1=br.readLine();
            // System.out.println("elements:");
            // if(f!=-1 && r!=-1)
            //     for(int i=f;i<=r;i++){
            //        System.out.print(dq[i]+" ");
            //     }
           
            
            if(op1.equals("push_back")){
                 // System.out.println("done:");
                String[] inp = op1.split(" "); 
                String n1=inp[0];
                int n2=Integer.parseInt(inp[1]);
                
                push_back(n2);
            }
            else if(op1.equals("pop_front")){
                pop_front();
            }
            else if(op1.equals("pop_back")){
                pop_back();
            }
            else {
                String[] inp = op1.split(" "); 
                String n1=inp[0];
                int n2=Integer.parseInt(inp[1]);
                
                push_front(n2);
            }
            

        }
        bw.flush(); //after all test cases
    }

}