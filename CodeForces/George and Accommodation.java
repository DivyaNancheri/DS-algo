import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int count=0;
        for(int t=0;t<T;t++) {
            int p, q;
            String[] inp=br.readLine().split(" ");
            p=Integer.parseInt(inp[0]);
            q=Integer.parseInt(inp[1]);
            
            if(q-p>=2){
                count++;
            }

            
        }
        bw.write(count+"\n");
        bw.flush(); //after all test cases
    }

}