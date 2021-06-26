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
            String ans="Success";
            if(inp.length()<=3){
                ans="Error";
            }else if(inp.charAt(0)!='<' || inp.charAt(1) !='/'){
                ans="Error";
            } else if(inp.charAt(inp.length()-1) !='>'){
                ans="Error";
            }else{
                for(int i=2;i<inp.length()-1;i++){
                    if(!((inp.charAt(i)>='a' && inp.charAt(i)<='z') || (inp.charAt(i)>='0' && inp.charAt(i)<='9'))){
                        ans="Error";
                    }
                }

            }
            bw.write(ans+"\n");
        }
        bw.flush(); //after all test cases
    }
}
