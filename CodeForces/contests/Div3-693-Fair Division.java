import java.io.*;
import java.util.*;

public class Solution {
    
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
            
            int sum=0;
            for(int j=0;j<n;j++){
                ar[j]=Integer.parseInt(inp[j]);
                sum+=ar[j];
            }
            if(n%2==0 && sum%2==0){
                bw.write("YES"+"\n");
            }
            else{
                bw.write("NO"+"\n");
            }    
        }
        bw.flush();
    }

}

//WA