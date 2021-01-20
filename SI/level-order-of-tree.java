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
    
    public static void levelOrder(Node root) throws IOException {
        if(root==null)
            return;
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        while(true){
            int count=queue.size();
            if(count==0) 
                break;
            while(count>0)
            {
                Node temp=queue.peek();
                bw.write(temp.data+" ");
                queue.remove(); 
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                count--;
            }  
            bw.newLine();
            
        }
//         1 2 3 4 5 
//         while(!queue.isEmpty())
//         {

//             Node temp=queue.peek();
//             bw.write(temp.data+" ");
//             queue.remove(); 
            
//             if(temp.left!=null)
//                 queue.add(temp.left);
//             if(temp.right!=null)
//                 queue.add(temp.right);
//         }           
//         bw.newLine();
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
        // static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            Node root = null;
            int n;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            inp=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                int ar=Integer.parseInt(inp[j]);
                root = insert(root, ar);
            }
            levelOrder(root); 
            bw.newLine();
        }
        
        bw.flush(); //after all test cases
    }
}