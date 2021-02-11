import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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

    static void rightView(Node root) throws IOException
    {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int n=queue.size();
            for(int i=1;i<=n;i++) {
                Node temp =queue.poll();
                if (i==n)
                    System.out.print(temp.data + " ");
                if (temp.left!=null)
                    queue.add(temp.left);
                if (temp.right!=null)
                    queue.add(temp.right);
            }
        }
        
    }
    public static void preOrder(Node root)throws IOException
    {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        if(root==null) return;
        bw.write(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        bw.flush();   
    }
    
    public static Node insert(Node root,int k)
    {
        if(root==null) return new Node(k);
        if(k<root.data)
            root.left=insert(root.left,k);
        else
            root.right=insert(root.right,k);
        return root;
    }

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String[] inp=br.readLine().split(" ");
            Node root=null;
            for(int i=0;i<n;i++)
            {
                int arr=Integer.parseInt(inp[i]);
                root=insert(root,arr);
            }
            rightView(root);
            System.out.println(" ");
            
        }
        bw.flush();
    }
}