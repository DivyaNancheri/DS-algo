import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-- >0){
            int n=sc.nextInt();
            int sum=0;
            int last=n%10, r=0;
            while(n>0){
                r=r*10+n%10;
                n=n/10;
            }
            sum=last+r%10  ;  
            System.out.println(sum);
        }
	}
}