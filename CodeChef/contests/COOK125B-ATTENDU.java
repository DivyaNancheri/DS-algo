import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution  {
    
        
    public static void main(String[] args) throws IOException {
 
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int tc=Integer.parseInt(br.readLine());
        for(int t=0;t<tc;t++) {
            int n=Integer.parseInt(br.readLine());
            String a=br.readLine();
            int one=0;
            for(int j=0;j<n;j++){
                if(a.charAt(j)=='1')
                    one++;
            }
            // bw.write("one="+one);  
            int res=((one+120-n)*100)/120;
            // bw.write("res="+((one+120-n)*100)/120);    

            if(res>75)
                bw.write("YES\n");
            else
                bw.write("NO\n");
            
        }
        bw.flush(); 
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
00000000000000000000 //20