import java.io.*;
import java.util.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    
    
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    
    static boolean isFBT(Node root){
        if(root==null)
            return true;
        if(root.left == null&&root.right == null ) 
            return true; 
        if((root.left!=null)&&(root.right!=null)) 
            return (isFBT(root.left)&&isFBT(root.right));
        return false;
    }
    

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            Node root = null;
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            for(int j=0;j<n;j++){
                ar[j]=Integer.parseInt(inp[j]);
                root = insert(root, ar[j]);
            }
            boolean res=isFBT(root);
            if(res==false)
                bw.write("False");
            else
                bw.write("True");
            bw.newLine();
            
        }
        bw.flush(); //after all test cases
    }

}