import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args)throws java.lang.Exception {
        int MAX = 5000000; 
        boolean[] p= new boolean[MAX+1];
        ArrayList<Integer> primes = new ArrayList<Integer>();
 
        for (int i = 0; i < MAX; i++) { 
            p[i]=true;
        }
 
        p[0]=false;
        p[1]=false;
        for (int i = 2; i<=Math.sqrt(MAX); i++) { 
            if(isPrime(i)==true){
                primes.add(i);
                for (int j=i*i;j<=MAX;j=j+i){
                    p[j]=false;
                }
            }
        }
        // for (int i = 2; i < MAX; i++) { 
        //     System.out.println("i="+i+" p[i]="+p[i]);
        // }
        // for (int i = 0; i < primes.size(); i++) { 
        //     System.out.println("i="+i+" primes.get(i)="+primes.get(i));
        // }
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- >0){
            int n=sc.nextInt();
 
            System.out.println(primes.get(n-1));
        }
 
    }
    
}


https://ideone.com/FAbwJv
