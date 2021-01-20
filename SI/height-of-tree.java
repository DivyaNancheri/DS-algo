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
    public static int height(Node root){
        if(root == null) 
            return -1;
        return 1+Math.max(height(root.left),height(root.right));
    }
        
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

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            Node root = null;
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            inp=br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                int arr=Integer.parseInt(inp[i]);
                root=insert(root,arr);
            }
            bw.write(Integer.toString(height(root))+"\n");
        }
        
        bw.flush(); //after all test cases
    }
}
