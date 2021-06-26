/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String inp=br.readLine();
            if(inp.charAt(0)=='1'){
                inp="10"+inp.substring(1);
            }else{
                inp = "1"+inp;
            }
            
            bw.write(inp+"\n");
        }
        bw.flush(); //after all test cases
    }
}
