import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String[] inp=br.readLine().split(" ");
            int l1x=Integer.parseInt(inp[0]);
            int l1y=Integer.parseInt(inp[1]);
            int r1x=Integer.parseInt(inp[2]);
            int r1y=Integer.parseInt(inp[3]);
            inp=br.readLine().split(" ");
            int l2x=Integer.parseInt(inp[0]);
            int l2y=Integer.parseInt(inp[1]);
            int r2x=Integer.parseInt(inp[2]);
            int r2y=Integer.parseInt(inp[3]);
 
            long area=0;
 
            long a1=(long)Math.abs(l1x-r1x)*(long)Math.abs(l1y-r1y);
            long a2=(long)Math.abs(l2x-r2x)*(long)Math.abs(l2y-r2y);
 
            long x = (Math.min(r1x, r2x)- Math.max(l1x, l2x));
            long y = (Math.min(r1y, r2y)- Math.max(l1y, l2y));
            if(x>0  && y>0){
                area = Math.abs(x * y);
            }
 
            bw.write((a1+a2-area)+"\n");
        }
        bw.flush(); //after all test cases
    }
}


// Sample Input 0

// 4
// 2 5 4 6
// 1 2 5 4
// -4 -3 -2 5
// -3 -5 1 3
// 1 0 3 5
// 2 3 5 8
// -2 2 4 4
// -3 1 5 5
// Sample Output 0

// 10
// 42
// 23
// 32