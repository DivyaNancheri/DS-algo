import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean isEven(int n){
        System.out.println("in iseven function");

        if(n%2==0)
            return true;
        return false;
    }
    
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int w,h,n;
            String[] inp=br.readLine().split(" ");
            w=Integer.parseInt(inp[0]);
            h=Integer.parseInt(inp[1]);
            n=Integer.parseInt(inp[2]);
            int count=0;
            if(n==1 && w>0 && h>0){
                bw.write("YES"+"\n");
            }
            else{
                // bw.write(w+" "+h+" "+n);
                // bw.newLine();
                while(h!=0 && w!=0 && (w%2==0 || h%2==0)){
                    // bw.write("count= "+count+"w= "+w+" h= "+h+"\n");
                    if(w%2==0 && h%2==0){
                        h=h/2;
                        count+=2;
                        // bw.write("count= "+count+"w= "+w+" h= "+h+"\n");
                    }
                    else if(w%2==0){
                        w=w/2;
                        count+=2;
                    }
                    else if(h%2==0){
                        h=h/2;
                        count+=2;
                        // bw.write("in h even"+"\n");
                        // bw.write("count= "+count+"w= "+w+" h= "+h+"\n");
                    }  
                }

                if(count>=n){
                    bw.write("YES"+"\n");
                }
                else{
                    bw.write("NO"+"\n");
                }
            }
            
        }
        bw.flush();
    }

}

//WA