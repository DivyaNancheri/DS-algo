import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeChef {
    // static final int MAX = 100; 
    
    static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws java.lang.Exception {
        int MAX = 100; 
        boolean[] p= new boolean[MAX];
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
                    if(p[j]==true){
                        p[j]=false;
                    }
                }
            }
        }
        for (int i = 1; i < MAX; i++) { 
            System.out.println("i="+i+" p[i]="+p[i]+" primes[i]="+primes.get(i));
        }

        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- >0){
            int n=sc.nextInt();
              
            System.out.println(primes.get(n));
        }

    }
}